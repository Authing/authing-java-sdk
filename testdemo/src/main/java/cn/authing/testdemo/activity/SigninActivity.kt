package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.SigninParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import cn.authing.testdemo.refreshToken
import cn.authing.testdemo.userToken
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val gson = Gson()

        btnNew.setOnClickListener {
            val builder = SigninParam.Builder()
            val type = signinType.checkedRadioButtonId
            val first = editFirst.text.toString()
            if (first.isBlank()) {
                txtResult.append("email/phone/username/unionid can not be empty")
                return@setOnClickListener
            }
            val psd = editPsd.text.toString()
            if (type != R.id.radioUnion && psd.isBlank()) {
                txtResult.append("psd can not be empty")
                return@setOnClickListener
            }
            when(type){
                R.id.radioUnion -> builder.initWithUnionId(first)
                R.id.radioEmail -> builder.initWithEmail(first, psd)
                R.id.radioPhone -> builder.initWithPhone(first, psd)
                R.id.radioUsername -> builder.initWithUsername(first, psd)
            }
            editOidcAppId.text.toString().takeUnless { it.isBlank() }?.let { builder.oidcAppId(it) }

            Authing.getUserService().signIn(builder.build()).enqueue(ResourceUtils.createCallback(txtResult, gson) {
                refreshToken = it?.refreshToken
                userToken = it?.token
            })
        }
    }
}