package cn.authing.core.utils;

import androidx.annotation.StringDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static cn.authing.core.utils.ThirdPartyType.WECHAT;
import static cn.authing.core.utils.ThirdPartyType.GITHUB;

@StringDef({
        GITHUB,
        WECHAT
})
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.SOURCE)
public @interface ThirdPartyType {
    public static final String GITHUB = "github";
    public static final String WECHAT = "wechat";
}
