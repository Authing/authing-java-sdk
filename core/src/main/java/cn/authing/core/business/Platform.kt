package cn.authing.core.business

import android.os.Build
import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor


internal open class Platform {

    open fun defaultCallbackExecutor(): Executor? {
        return null
    }

    companion object {
        val platform = findPlatform()

        private fun findPlatform(): Platform {
            try {
                Class.forName("android.os.Build")
                if (Build.VERSION.SDK_INT != 0) {
                    return Android()
                }
            } catch (ignored: ClassNotFoundException) {
            }
            try {
                Class.forName("java.util.Optional")
                return Java8()
            } catch (ignored: ClassNotFoundException) {
            }
            return Platform()
        }
    }


    internal class Java8 : Platform()

    internal class Android : Platform() {
        override fun defaultCallbackExecutor(): Executor {
            return MainThreadExecutor()
        }
    }

    private class MainThreadExecutor : Executor {
        private val handler = Handler(Looper.getMainLooper())

        override fun execute(p0: Runnable?) {
            if (p0 == null) {
                return
            }
            handler.post(p0)
        }
    }
}