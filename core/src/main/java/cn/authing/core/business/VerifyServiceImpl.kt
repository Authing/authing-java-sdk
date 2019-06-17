package cn.authing.core.business

import com.google.gson.reflect.TypeToken

import cn.authing.core.http.Call
import cn.authing.core.param.SendResetPasswordEmailParam
import cn.authing.core.param.SendVerifyEmailParam
import cn.authing.core.param.VerifyResetPasswordCodeParam
import cn.authing.core.result.Result

import cn.authing.core.utils.AuthingUtils.URL_USER

internal class VerifyServiceImpl(private val helper: HttpHelper) : cn.authing.core.service.VerifyService {

    override fun sendPhoneVerifyCode(phoneNumber: String): Call<Result> {
        val builder = "https://users.authing.cn/send_smscode/" +
                phoneNumber + '/'.toString() + ImportantParam.clientId
        return helper.createNormalCall(builder, Result::class.java)
    }

    override fun sendResetPasswordEmail(param: SendResetPasswordEmailParam): Call<Result> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<Result>>() {},
                param,
                null
        )
    }

    override fun verifyResetPasswordCode(param: VerifyResetPasswordCodeParam): Call<Result> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<Result>>() {},
                param, null
        )
    }

    override fun sendVerifyEmail(param: SendVerifyEmailParam): Call<Result> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<Result>>() {},
                param,
                ImportantParam.ownerToken
        )
    }
}
