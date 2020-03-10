package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.LoginByOidcParam
import cn.authing.testdemo.*
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_login_by_oidc.*

class LoginByOidcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_by_oidc)
        editOidcClientId.setText(oidcClientId)
        editOidcSecret.setText(oidcSecret)
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
            val builder = LoginByOidcParam.Builder(clientId, secret)
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
            when (type) {
                R.id.radioUnion -> builder.initWithUnionId(first)
                R.id.radioEmail -> builder.initWithEmail(first, psd)
                R.id.radioPhone -> builder.initWithPhone(first, psd)
                R.id.radioUsername -> builder.initWithUsername(first, psd)
            }

            Authing.getUserService().loginByOidc(builder.build()).enqueue(ResourceUtils.createCallback(txtResult, gson) {
                refreshToken = it?.refreshToken
                userToken = it?.token
            })
        }
    }
}