package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.CreateRoleParam
import cn.authing.core.param.ReadRolesParam
import cn.authing.core.param.UpdateRoleParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_role.*

class RoleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_role)

        val gson = Gson()

        btnGet.setOnClickListener {
            val param = ReadRolesParam.Builder().build()
            Authing.getPermissionService().readRoles(param)
                    .enqueue(ResourceUtils.createCallback(txtResult, gson) {
                        if (it == null) {
                            return@createCallback
                        }
                        editRoleId.setText(it.list[0].id)
                    })
        }

        btnCreate.setOnClickListener {
            val name = editName.text.toString()
            val desc = editDesc.text.toString()

            val param = CreateRoleParam.Builder(name, desc).build()
            Authing.getPermissionService().createRole(param)
                    .enqueue(ResourceUtils.createCallback(txtResult, gson) {
                        if (it == null) {
                            return@createCallback
                        }
                        editRoleId.setText(it.id)
                    })
        }

        btnUpdate.setOnClickListener {
            val name: String? = editName.text.toString().takeIf { it.isNotBlank() }
            val desc: String? = editDesc.text.toString().takeIf { it.isNotBlank() }
            val param = UpdateRoleParam.Builder(editRoleId.text.toString())
                    .name(name)
                    .permissions("route:all")
                    .desc(desc).build()

            Authing.getPermissionService().updateRoleInfo(param)
                    .enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }
    }

}