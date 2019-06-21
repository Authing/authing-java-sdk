package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.LoginByPhoneParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import cn.authing.testdemo.userId
import cn.authing.testdemo.userToken
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_login_phone.*

class LoginPhoneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_phone)
        val gson = Gson()

        btnSendVerify.setOnClickListener {
            val phone = editPhone.text.toString()
            if (phone.isBlank() || phone.length != 11) {
                txtResult.append("phone number is invalid")
                return@setOnClickListener
            }
            Authing.getVerifyService().sendPhoneVerifyCode(phone)
                    .enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }

        btnNew.setOnClickListener {
            val phone = editPhone.text.toString()
            if (phone.isBlank() || phone.length != 11) {
                txtResult.append("phone number is invalid")
                return@setOnClickListener
            }
            val code = editCode.text.toString()
            if (code.isBlank()) {
                txtResult.append("code can not be empty")
                return@setOnClickListener
            }
            Authing.getUserService().loginByPhone(
                    LoginByPhoneParam.Builder(phone, code)
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, gson) {
                userToken = it?.token
                userId = it?.id
            })
        }

        btnOld.setOnClickListener {
        }
    }
}