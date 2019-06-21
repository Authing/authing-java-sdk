package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.SendVerifyEmailParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_verify_email.*

class VerifyEmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_email)

        btnVerify.setOnClickListener {
            val email = editEmail.text.toString()
            if (email.isBlank()) {
                txtResult.append("email can not be empty")
                return@setOnClickListener
            }
            Authing.getVerifyService().sendVerifyEmail(
                    SendVerifyEmailParam.Builder(email)
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, Gson()) {})
        }
    }
}