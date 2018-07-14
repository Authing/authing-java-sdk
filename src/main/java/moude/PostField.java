package moude;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yue
 * Date: 2018-05-29
 * Time: 20:51
 * Description:
 */
public class PostField {
    private String query;
    private Map variables;

    public PostField(String query, Option option){
        this.query=query;
        this.variables=option.getOption();
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Map getVariables() {
        return variables;
    }

    public void setVariables(Map variables) {
        this.variables = variables;
    }
}
