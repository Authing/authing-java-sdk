package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.UserInfoParam
import cn.authing.core.param.UserPatchParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import cn.authing.testdemo.userId
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_user_info.*

class UserInfoActivity : AppCompatActivity() {

    private val patchBuilder = UserPatchParam.Builder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        editUserId.setText(userId)

        val gson = Gson()
        btnAddId.setOnClickListener {
            val userId = editUserId.text.toString()
            if (userId.isBlank()) {
                txtResult.append("userid can not be empty")
                return@setOnClickListener
            }
            patchBuilder.addUserId(userId)
        }

        btnInfo.setOnClickListener {
            val userId = editUserId.text.toString()
            if (userId.isBlank()) {
                txtResult.append("userid can not be empty")
                return@setOnClickListener
            }
            Authing.getUserService().getUserInfo(
                    UserInfoParam.Builder(userId)
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }

        btnPatch.setOnClickListener {
            Authing.getUserManageService().getUserInfo(
                    patchBuilder.build()
            ).enqueue(ResourceUtils.createCallback(txtResult, gson) {})
            patchBuilder.clear()
        }
    }
}