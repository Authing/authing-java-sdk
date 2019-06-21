package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.RemoveUserParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import cn.authing.testdemo.userId
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_remove_user.*

class RemoveUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remove_user)
        val gson = Gson()

        editUserId.setText(userId)

        btnRemove.setOnClickListener {
            val userId = editUserId.text.toString()
            if (userId.isBlank()) {
                txtResult.append("user id can not be empty")
                return@setOnClickListener
            }
            Authing.getUserManageService().removeUser(
                    RemoveUserParam.Builder(userId)
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }
    }
}