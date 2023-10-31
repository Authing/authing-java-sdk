package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SystmeInfoVersion {
    /**
     * Authing 核心服务版本号
     */
    @JsonProperty("server")
    private String server;
    /**
     * Authing 控制台版本号
     */
    @JsonProperty("console")
    private String console;
    /**
     * Authing 托管登录页版本号
     */
    @JsonProperty("login")
    private String login;

    public String getServer() {
        return server;
    }
    public void setServer(String server) {
        this.server = server;
    }

    public String getConsole() {
        return console;
    }
    public void setConsole(String console) {
        this.console = console;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }



}