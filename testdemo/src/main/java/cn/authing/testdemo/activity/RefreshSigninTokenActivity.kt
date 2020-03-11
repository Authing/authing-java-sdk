package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.RefreshSigninTokenParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import cn.authing.testdemo.refreshToken
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_refresh_signin_token.*

class RefreshSigninTokenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refresh_signin_token)
        editRefreshToken.setText(refreshToken)
        val gson = Gson()

        btnNew.setOnClickListener {
            val token = editRefreshToken.text.toString()
            if (token.isBlank()) {
                txtResult.append("refresh token can not be empty")
                return@setOnClickListener
            }

            val builder = RefreshSigninTokenParam.Builder(token)
            editOidc.text.toString().takeUnless { it.isBlank() }?.let { builder.oidcAppId(it) }
            Authing.getUserService().refreshSignInToken(builder.build()).enqueue(ResourceUtils.createCallback(txtResult, gson) {
                refreshToken = it?.refreshToken
            })
        }
    }
}
