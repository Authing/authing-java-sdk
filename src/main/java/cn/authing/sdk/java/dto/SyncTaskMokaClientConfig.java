package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskMokaClientConfig {
    /**
     * User Name
     */
    @JsonProperty("userName")
    private String userName;
    /**
     * Ent Code
     */
    @JsonProperty("entCode")
    private String entCode;
    /**
     * Api Code Employee
     */
    @JsonProperty("apiCode_employee")
    private String apiCodeEmployee;
    /**
     * Api Code Department
     */
    @JsonProperty("apiCode_department")
    private String apiCodeDepartment;
    /**
     * Private Key
     */
    @JsonProperty("privateKey")
    private String privateKey;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEntCode() {
        return entCode;
    }
    public void setEntCode(String entCode) {
        this.entCode = entCode;
    }

    public String getApiCodeEmployee() {
        return apiCodeEmployee;
    }
    public void setApiCodeEmployee(String apiCodeEmployee) {
        this.apiCodeEmployee = apiCodeEmployee;
    }

    public String getApiCodeDepartment() {
        return apiCodeDepartment;
    }
    public void setApiCodeDepartment(String apiCodeDepartment) {
        this.apiCodeDepartment = apiCodeDepartment;
    }

    public String getPrivateKey() {
        return privateKey;
    }
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }



}