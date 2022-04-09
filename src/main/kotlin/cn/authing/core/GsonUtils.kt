package cn.authing.core

import com.google.gson.TypeAdapterFactory

object GsonUtils {
    fun getIndex(list: List<TypeAdapterFactory>): Int {
        for (i in list.indices) {
            val factory = list[i]
            val aClass: Class<out TypeAdapterFactory> = factory.javaClass
            if (aClass.name.contains("ObjectTypeAdapter")) {
                return i
            }
        }
        return 1;
    }
}
