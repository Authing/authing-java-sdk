package cn.authing.testdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.authing.core.Authing
import cn.authing.core.param.UserListParam
import cn.authing.testdemo.R
import cn.authing.testdemo.ResourceUtils
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_user_list.*

class UserListActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)
        val gson = Gson()

        btnNew.setOnClickListener {
            val count = editCount.text.toString().toInt()
            val page = editPage.text.toString().toInt()
            val param = UserListParam.Builder().count(count).page(page).build()
            val call = Authing.getUserManageService().getUserList(param)
            call.enqueue(ResourceUtils.createCallback(txtResult, gson) {})
        }
    }
}