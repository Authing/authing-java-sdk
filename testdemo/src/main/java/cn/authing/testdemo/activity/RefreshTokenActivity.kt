package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.RefreshTokenParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import cn.authing.testdemo.userId
import cn.authing.testdemo.userToken
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_refresh_token.*

class RefreshTokenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refresh_token)
        val gson = Gson()
        txtResult.append("now token=$userToken")
        btnNew.setOnClickListener {
            Authing.getUserService().refreshToken(
                    RefreshTokenParam.Builder(userId)
                            .build()
            ).enqueue(ResourceUtils.createCallback(txtResult, gson) {
                userToken = it?.token
            })
        }
    }
}