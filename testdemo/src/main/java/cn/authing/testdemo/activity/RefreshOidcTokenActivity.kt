package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.RefreshOidcTokenParam
import cn.authing.testdemo.*
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_refresh_oidc_token.*

class RefreshOidcTokenActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refresh_oidc_token)
        editOidcClientId.setText(oidcClientId)
        editOidcSecret.setText(oidcSecret)
        editRefreshToken.setText(refreshToken)
        val gson = Gson()

        btnNew.setOnClickListener {
            val clientId = editOidcClientId.text.toString()
            if (clientId.isBlank()) {
                txtResult.append("oidc clientId can not be empty")
                return@setOnClickListener
            }
            val secret = editOidcSecret.text.toString()
            if (secret.isBlank()) {
                txtResult.append("oidc client secret can not be empty")
                return@setOnClickListener
            }
            val token = editRefreshToken.text.toString()
            if (token.isBlank()) {
                txtResult.append("refresh token can not be empty")
                return@setOnClickListener
            }

            val builder = RefreshOidcTokenParam.Builder(clientId, secret, token)
            Authing.getUserService().refreshOidcToken(builder.build()).enqueue(ResourceUtils.createCallback(txtResult, gson) {
                refreshToken = it?.refreshToken
            })
        }
    }
}