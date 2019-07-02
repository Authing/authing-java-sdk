package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.AssignRoleToUserParam
import cn.authing.core.param.ReadPermissionsParam
import cn.authing.core.param.RemoveUserFromRoleParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import cn.authing.testdemo.userId
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_permission.*

class UserPermissionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)

        val gson = Gson()

        btnGet.setOnClickListener {
            val param = ReadPermissionsParam.Builder(userId).build()
            Authing.getPermissionService().readPermissions(param)
                    .enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }

        btnAssign.setOnClickListener {
            val roleId = editRoleId.text.toString()
            val param = AssignRoleToUserParam.Builder(roleId, userId).build()
            Authing.getPermissionService().assiginRoleToUser(param)
                    .enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }

        btnRemove.setOnClickListener {
            val roleId = editRoleId.text.toString()
            val param = RemoveUserFromRoleParam.Builder(roleId, userId).build()
            Authing.getPermissionService().removeUserFromRole(param)
                    .enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }
    }
}