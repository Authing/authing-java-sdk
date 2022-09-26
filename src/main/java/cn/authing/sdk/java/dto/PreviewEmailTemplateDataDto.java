package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PreviewEmailTemplateDataDto {
    /**
     * 预览的邮件主体内容，为 html 格式文本
     */
    @JsonProperty("content")
    private String content;
    /**
     * 预览的邮件主题内容
     */
    @JsonProperty("subject")
    private String subject;
    /**
     * 预览的邮件发件人内容
     */
    @JsonProperty("sender")
    private String sender;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }



}