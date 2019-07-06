package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.BindThirdPartyOAuthParam
import cn.authing.core.param.ReadUserOAuthListParam
import cn.authing.core.param.UnbindThirdPartyOAuthParam
import cn.authing.core.utils.ThirdPartyType
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_bind_third_party_oauth.*

class BindThirdPartyOAuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bind_third_party_oauth)

        val gson = Gson()

        btnBind.setOnClickListener {
            val userInfo = "{'login':'demo','id':12345678}"
            val param = BindThirdPartyOAuthParam.Builder(ThirdPartyType.WECHAT, "12345678", userInfo).build()
            Authing.getOAuthService().bindThirdPartyOAuth(param)
                    .enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }

        btnList.setOnClickListener {
            val param = ReadUserOAuthListParam.Builder().build()
            Authing.getOAuthService().readUserOAuthList(param)
                    .enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }

        btnUnbind.setOnClickListener {
            val param = UnbindThirdPartyOAuthParam.Builder(ThirdPartyType.WECHAT).build()
            Authing.getOAuthService().unbindThirdPartyOAuth(param)
                    .enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }
    }
}