package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.RegisterParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
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
            val nickname = editNickname.text.toString().takeIf { it.isNotBlank() }
            Authing.getUserService().register(
                    RegisterParam.Builder(email, psd)
                            .nickname(nickname)
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }
    }
}