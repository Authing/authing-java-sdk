import java.util.List;
import java.util.Properties;

/**
 * TestTemplate
 *
 * @author chho
 */
public class TestTemplate {
    
    String className;
    
    List<Method> methods;
    
    public List<Method> getMethods() {
        return methods;
    }
    
    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }
    
    public String getClassName() {
        return className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }
    
    
    public static class Parameter {
        String className;
        String name;
        String value;
        List<Parameter> properties;
    
        public String getClassName() {
            return className;
        }
    
        public void setClassName(String className) {
            this.className = className;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getValue() {
            return value;
        }
    
        public void setValue(String value) {
            this.value = value;
        }
    
        public List<Parameter> getProperties() {
            return properties;
        }
    
        public void setProperties(List<Parameter> properties) {
            this.properties = properties;
        }
    }
    
    public static class Method {
        
        String methodName;
        List<Parameter> reqParameters;
        String reqClass;
        String respClass;
    
        public String getMethodName() {
            return methodName;
        }
    
        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }
    
        public List<Parameter> getReqParameters() {
            return reqParameters;
        }
    
        public void setReqParameters(List<Parameter> reqParameters) {
            this.reqParameters = reqParameters;
        }
    
        public String getReqClass() {
            return reqClass;
        }
    
        public void setReqClass(String reqClass) {
            this.reqClass = reqClass;
        }
    
        public String getRespClass() {
            return respClass;
        }
    
        public void setRespClass(String respClass) {
            this.respClass = respClass;
        }
    }
}
