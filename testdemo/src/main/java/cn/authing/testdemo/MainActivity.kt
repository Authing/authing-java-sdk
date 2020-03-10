package cn.authing.testdemo

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cn.authing.core.Authing
import cn.authing.core.param.InitParam
import cn.authing.testdemo.activity.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val functions = listOf(
            Authing::class.java,
            RegisterActivity::class.java,
            LoginEmailActivity::class.java,
            LoginPhoneActivity::class.java,
            RefreshTokenActivity::class.java,
            UserInfoActivity::class.java,
            RemoveUserActivity::class.java,
            UpdateUserInfoActivity::class.java,
            ResetPsdActivity::class.java,
            VerifyEmailActivity::class.java,
            UnbindEmailActivity::class.java,
            BindThirdPartyOAuthActivity::class.java,
            RoleActivity::class.java,
            UserPermissionActivity::class.java,
            SigninActivity::class.java,
            RefreshSigninTokenActivity::class.java,
            CheckLoginStatusActivity::class.java
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        recyclerFunctions.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerFunctions.adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
                val btn = Button(parent.context)
                btn.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                return object : RecyclerView.ViewHolder(btn) {}
            }

            override fun getItemCount(): Int {
                return functions.size
            }

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                val activity = functions[position]
                val button = holder.itemView as Button
                button.text = activity.simpleName
                button.setOnClickListener {
                    if (activity == Authing::class.java) {
                        initAuthing(position)
                        return@setOnClickListener
                    }
                    startActivity(Intent(this@MainActivity, activity))
                }
            }
        }
    }

    private fun initAuthing(pos: Int) {
        val param = InitParam.Builder(clientId).secret("35023039bb82da7edca0d8db7646e2f3").build()
        Authing.init(param)
    }
}
