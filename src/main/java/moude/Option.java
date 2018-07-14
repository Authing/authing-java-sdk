package moude;

import Exception.AuthingException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yue
 * Date: 2018-05-29
 * Time: 9:49
 * Description:
 */
public class Option {
    private Map<String,Object> option;

    public Option(Builder builder){
        this.option=builder.option;
    }

    public Object getBykey(String key){
        return option.get(key);
    }

    public void updateValue(String key,Object value){
        if (option.containsKey(key)){
            option.put(key,value);
        }
    }

    public Boolean checkByKey(String key){
        if (option.containsKey(key)&&option.get(key)!=null){
            return true;
        }
        return false;
    }

    public Boolean checkByKeys(String[] keys)throws AuthingException{
        for (String key:keys) {
            if (!option.containsKey(key)||option.get(key)==null){
                throw new AuthingException("please make sure param "+key+" exist and not null");
            }
        }
        return true;
    }


    public Map<String,Object> getOption(){
        return  option;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static Builder builder(String clientId){
        return new Builder();
    }

    public static class Builder {
        private Map<String,Object> option=new HashMap<String, Object>();

        public void Builder(){

        }

        public void Builder(String clientId){
            this.putOption("registerInClient",clientId);
        }

        public Builder putOption(String key,Object value){
            option.put(key,value);
            return this;
        }

        public Option build(){
            return new Option(this);
        }
    }

}