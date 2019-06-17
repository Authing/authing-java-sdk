package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.UnbindEmailParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_unbind_email.*

class UnbindEmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unbind_email)

        btnUnbind.setOnClickListener {
            val email = editEmail.text.toString()
            if (email.isBlank()) {
                txtResult.append("email can not be empty")
                return@setOnClickListener
            }
            Authing.getOAuthService().unbindEmail(
                    UnbindEmailParam.Builder()
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, Gson()) {})
        }
    }
}