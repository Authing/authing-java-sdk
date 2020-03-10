package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.CheckLoginStatusParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import cn.authing.testdemo.userToken
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_check_login_status.*

class CheckLoginStatusActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_login_status)
        editToken.setText(userToken)
        val gson = Gson()

        btnNew.setOnClickListener {
            val token = editToken.text.toString()
            if (token.isBlank()) {
                txtResult.append("token can not be empty")
                return@setOnClickListener
            }

            val builder = CheckLoginStatusParam.Builder(token)
            Authing.getUserService().checkLoginStatus(builder.build()).enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }
    }
}