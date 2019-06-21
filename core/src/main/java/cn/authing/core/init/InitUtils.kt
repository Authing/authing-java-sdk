package cn.authing.core.init

import cn.authing.core.business.AuthingResponse
import cn.authing.core.business.HttpHelper
import cn.authing.core.business.ImportantParam
import cn.authing.core.http.Callback
import cn.authing.core.result.ErrorInfo
import cn.authing.core.utils.AuthingUtils
import com.google.gson.reflect.TypeToken

internal var hasInit: Boolean = false
    private set

internal fun init(helper: HttpHelper, clientId: String, secret: String?) {
    ImportantParam.clientId = clientId
    val param = if (secret == null) {
        InitParam.Builder(clientId)
                .timestamp(System.currentTimeMillis() / 1000)
                .nonce(getNonce())
                .build()
    } else {
        InitParam.Builder(clientId).secret(secret).build()
    }
    // 初始化 authing
    helper.createAuthingCall(
            AuthingUtils.URL_USER,
            object : TypeToken<AuthingResponse<InitResult>>() {},
            param
    ).enqueue(object : Callback<InitResult> {
        override fun onFailure(error: ErrorInfo?) {
            println("Authing init fail, code-${error?.code}, msg-${error?.message}")
        }

        override fun onSuccess(result: InitResult?) {
            if (hasInit || result?.accessToken == null) {
                return
            }
            ImportantParam.ownerToken = result.accessToken
            println("Authing init success, accessToken=${result.accessToken}")
            hasInit = true
        }
    })
}

internal fun destroy() {
    hasInit = false
}

internal fun getNonce(): Int {
    return Math.ceil(Math.random() * Math.pow(10.0, 6.0)).toInt()
}