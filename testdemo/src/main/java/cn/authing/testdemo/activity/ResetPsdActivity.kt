package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.ResetPasswordParam
import cn.authing.core.param.SendResetPasswordEmailParam
import cn.authing.core.param.VerifyResetPasswordCodeParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_reset_psd.*

class ResetPsdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_psd)


        val gson = Gson()

        btnSendEmail.setOnClickListener {
            val email = editEmail.text.toString()
            if (email.isBlank()) {
                txtResult.append("email can not be empty")
                return@setOnClickListener
            }
            Authing.getVerifyService().sendResetPasswordEmail(
                    SendResetPasswordEmailParam.Builder(email)
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }

        btnVerifyCode.setOnClickListener {
            val email = editEmail.text.toString()
            if (email.isBlank()) {
                txtResult.append("email can not be empty")
                return@setOnClickListener
            }
            val code = editCode.text.toString()
            if (code.isBlank()) {
                txtResult.append("code can not be empty")
                return@setOnClickListener
            }
            Authing.getVerifyService().verifyResetPasswordCode(
                    VerifyResetPasswordCodeParam.Builder(email, code)
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }

        btnResetPsd.setOnClickListener {
            val email = editEmail.text.toString()
            if (email.isBlank()) {
                txtResult.append("email can not be empty")
                return@setOnClickListener
            }
            val code = editCode.text.toString()
            if (code.isBlank()) {
                txtResult.append("code can not be empty")
                return@setOnClickListener
            }
            val newPsd = editNewPsd.text.toString()
            if (newPsd.isBlank()) {
                txtResult.append("newPsd can not be empty")
                return@setOnClickListener
            }
            Authing.getUserService().resetPassword(
                    ResetPasswordParam.Builder(email, newPsd, code)
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }

    }
}