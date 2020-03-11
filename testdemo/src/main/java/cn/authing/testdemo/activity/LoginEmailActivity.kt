package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.LoginByEmailParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import cn.authing.testdemo.userId
import cn.authing.testdemo.userToken
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_login_email.*

class LoginEmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_email)
        val gson = Gson()

        btnNew.setOnClickListener {
            val email = editEmail.text.toString()
            if (email.isBlank()) {
                txtResult.append("email can not be empty")
                return@setOnClickListener
            }
            val psd = editPsd.text.toString()
            if (psd.isBlank()) {
                txtResult.append("psd can not be empty")
                return@setOnClickListener
            }
            Authing.getUserService().loginByEmail(
                    LoginByEmailParam.Builder(email, psd)
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, gson) {
                userToken = it?.token
                userId = it?.id
            })
        }
    }
}
