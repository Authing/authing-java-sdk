package cn.authing.core;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;

import java.util.List;

public class GsonUtils {

    public static Integer getIndex(List<TypeAdapterFactory> list){
        for (int i = 0; i < list.size(); i++) {
            TypeAdapterFactory factory = list.get(i);
            Class<? extends TypeAdapterFactory> aClass = factory.getClass();
            if (aClass.getName().contains("ObjectTypeAdapter")){
                return i;
            }
        }
        return null;
    }
}
