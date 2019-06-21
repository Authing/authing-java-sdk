package cn.authing.testdemo

import android.widget.TextView
import cn.authing.core.http.Callback
import cn.authing.core.result.ErrorInfo
import com.google.gson.Gson

object ResourceUtils {
    const val DIVIDER = "\n==================\n"

    inline fun <reified T> createCallback(txtConsole: TextView, gson: Gson, crossinline success: (T?) -> Unit): Callback<T> {
        return object : Callback<T> {
            override fun onSuccess(result: T?) {
                txtConsole.append(DIVIDER + gson.toJson(result))
                success.invoke(result)
            }

            override fun onFailure(error: ErrorInfo?) {
                txtConsole.append(DIVIDER + gson.toJson(error))
            }
        }
    }
}