import cn.authing.sdk.java.client.ManagementClient;
import cn.hutool.core.util.StrUtil;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

/**
 * TestGenerator
 *
 * @author chho
 */
public class GoTestGenerator2 {
    
    public static void main(String[] args) throws Throwable{
        File file = new File("D:\\Work\\Java_\\Workspace\\Authing\\authing-java-sdk-v5\\target\\classes\\cn\\authing\\sdk\\java\\dto");
        Map<String, Class<?>> classMap = new HashMap<>();
        for (File f : Objects.requireNonNull(file.listFiles())) {
            String s = f.getName().split("\\.")[0];
            Class<?> aClass = Class.forName("cn.authing.sdk.java.dto." + s);
            classMap.put(aClass.getCanonicalName(), aClass);
        }
        
        Method[] methods = ManagementClient.class.getDeclaredMethods();
        TestTemplate testTemplate = new TestTemplate();
        testTemplate.setClassName("ManagementClient");
        testTemplate.setMethods(new ArrayList<>());
        
        for (Method m : methods) {
            System.out.println("-------------------- method " + m.getName() + " --------------------");
            TestTemplate.Method method = new TestTemplate.Method();
            method.setRespClass(m.getReturnType().getSimpleName());
            method.setMethodName(m.getName());
            method.setReqParameters(new ArrayList<>());
            for (java.lang.reflect.Parameter p : m.getParameters()) {
                
                TestTemplate.Parameter parameter = new TestTemplate.Parameter();
                parameter.setClassName(p.getType().getSimpleName());
                parameter.setName("request");
                parameter.setValue(generateValue(p));
                
                List<TestTemplate.Parameter> properties = new ArrayList<>();
                for (Field field : p.getType().getDeclaredFields()) {
                    TestTemplate.Parameter property = new TestTemplate.Parameter();
                    property.setClassName(field.getType().getSimpleName());
                    property.setName(field.getName());
                    property.setValue(generateValue(field, p.getType(), classMap));
                    property.setProperties(new ArrayList<>());
                    properties.add(property);
                }
                parameter.setProperties(properties);
                method.getReqParameters().add(parameter);
                method.setFirstParameter(parameter);
            }
            if (method.getFirstParameter() == null) {
                System.out.println("method:" + method);
            }
            testTemplate.getMethods().add(method);
        }
    
        for (TestTemplate.Method method : testTemplate.getMethods()) {
            // write
            FileReader fileReader = new FileReader(new File("D:\\Work\\Java_\\Workspace\\Authing\\authing-java-sdk-v5\\src\\test\\java\\resources\\go_template2.ftl"));
            FileWriter fileWriter = new FileWriter(new File("D:\\Work\\Java_\\Workspace\\Authing\\authing-java-sdk-v5\\src\\test\\go\\test\\" + StrUtil.upperFirst(method.getMethodName()) + "Test.go"));
    
            FreeMarkerUtils.process(fileReader, fileWriter, method, method.getMethodName());
        }
        
        
        
    }
    
    private static String generateValue(java.lang.reflect.Parameter p) {
        if (p.getType().isAssignableFrom(List.class)) {
            return "nil";
        }
        if (p.getType().isAssignableFrom(String.class)) {
            return "\"" + UUID.randomUUID().toString() + "\"";
        }
        if (p.getType().isAssignableFrom(Number.class)) {
            return "0";
        }
        return "nil";
    }
    
    private static String generateValue(Field f, Class<?> p, Map<String, Class<?>> classMap) {
        if (f.getType().isAssignableFrom(List.class)) {
            Type fc = f.getGenericType(); //如果是List类型，得到其Generic的类型
            if(fc instanceof ParameterizedType){
                ParameterizedType pt = (ParameterizedType) fc;
                //得到泛型里的class类型对象。
                Class<?> genericClazz = (Class<?>)pt.getActualTypeArguments()[0];
//                return "Collections.singletonList(" + generateValue(genericClazz, classMap) + ")";
            }
            return "nil";
        }
        if (f.getType().isAssignableFrom(String.class)) {
            return "\"" + f.getName() + "_" + new Random().nextInt(9999) + "\"";
        }
        if (f.getType().isAssignableFrom(Integer.class)) {
            return "0";
        }
        if (f.getType().isAssignableFrom(Long.class)) {
            return "0";
        }
        if (f.getType().isEnum()) {
            Object[] enumConstants = f.getType().getEnumConstants();
            String s = enumConstants[0].toString();
            return "";
        }
        if (f.getType().getCanonicalName().equals(Boolean.class.getCanonicalName())) {
            return "false";
        }
        if (classMap.containsKey(f.getType().getCanonicalName())) {
            return "nil";
        }
        return "nil";
    }
    
    private static String generateValue(Class<?> f, Map<String, Class<?>> classMap) {
        if (f.isAssignableFrom(String.class)) {
            return "\"" + f.getSimpleName() + "_" + new Random().nextInt(9999) + "\"";
        }
        if (f.isAssignableFrom(Integer.class)) {
            return "0";
        }
        if (f.isAssignableFrom(Long.class)) {
            return "0";
        }
        if (f.isEnum()) {
            Object[] enumConstants = f.getEnumConstants();
            String s = enumConstants[0].toString();
            return f.getCanonicalName() + "." + s;
        }
        if (f.getCanonicalName().equals(Boolean.class.getCanonicalName())) {
            return "false";
        }
        if (classMap.containsKey(f.getCanonicalName())) {
            return "nil";
        }
        return null;
    }
}
