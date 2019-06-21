package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.UpdateUserInfoParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import cn.authing.testdemo.userId
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_update_user_info.*

class UpdateUserInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_user_info)
        editUserId.setText(userId)
        val gson = Gson()

        btnUpdate.setOnClickListener {
            val userId = editUserId.text.toString()
            if (userId.isBlank()) {
                txtResult.append("user id can not be empty")
                return@setOnClickListener
            }
            val nickname = editNickname.text.toString()
            val oldPsd = editOldPsd.text.toString()
            val newPsd = editNewPsd.text.toString()
            val email = editEmail.text.toString()
            Authing.getUserService().updateUserInfo(
                    UpdateUserInfoParam.Builder(userId)
                            .apply {
                                nickname(nickname)
                                if (oldPsd.isNotBlank() && newPsd.isNotBlank()) {
                                    password(oldPsd, newPsd)
                                }
                                email(email)
                            }
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }
    }
}