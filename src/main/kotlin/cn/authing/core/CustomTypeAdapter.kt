package cn.authing.core

import java.lang.IllegalStateException
import com.google.gson.Gson
import com.google.gson.TypeAdapter
import com.google.gson.TypeAdapterFactory
import com.google.gson.internal.LinkedTreeMap
import com.google.gson.internal.bind.ObjectTypeAdapter
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonToken
import com.google.gson.stream.JsonWriter
import java.lang.Exception
import java.util.ArrayList

class CustomTypeAdapter private constructor(private val gson: Gson) : TypeAdapter<Any?>() {

    override fun read(`in`: JsonReader): Any? {
        val token = `in`.peek()
        return when (token) {
            JsonToken.BEGIN_ARRAY -> {
                val list: MutableList<Any?> = ArrayList()
                `in`.beginArray()
                while (`in`.hasNext()) {
                    list.add(read(`in`))
                }
                `in`.endArray()
                list
            }
            JsonToken.BEGIN_OBJECT -> {
                val map: MutableMap<String, Any?> = LinkedTreeMap()
                `in`.beginObject()
                while (`in`.hasNext()) {
                    map[`in`.nextName()] = read(`in`)
                }
                `in`.endObject()
                map
            }
            JsonToken.STRING -> `in`.nextString()
            JsonToken.NUMBER -> {
                val s = `in`.nextString()
                if (s.contains(".")) {
                    java.lang.Double.valueOf(s)
                } else {
                    try {
                        Integer.valueOf(s)
                    } catch (e: Exception) {
                        java.lang.Long.valueOf(s)
                    }
                }
            }
            JsonToken.BOOLEAN -> `in`.nextBoolean()
            JsonToken.NULL -> {
                `in`.nextNull()
                null
            }
            else -> throw IllegalStateException()
        }
    }

    override fun write(out: JsonWriter, value: Any?) {
        if (value == null) {
            out.nullValue()
            return
        }
        val typeAdapter = gson.getAdapter(value.javaClass) as TypeAdapter<Any>
        if (typeAdapter is ObjectTypeAdapter) {
            out.beginObject()
            out.endObject()
            return
        }
        typeAdapter.write(out, value)
    }

    companion object {
        val FACTORY: TypeAdapterFactory = object : TypeAdapterFactory {
            override fun <T> create(gson: Gson, type: TypeToken<T>): TypeAdapter<T>? {
                return if (type.rawType == Any::class.java) {
                    CustomTypeAdapter(gson) as TypeAdapter<T>
                } else null
            }
        }
    }
}