package cn.authing.core;

import org.jetbrains.annotations.NotNull;

import cn.authing.core.business.HttpHelper;
import cn.authing.core.business.OAuthServiceImpl;
import cn.authing.core.business.PermissionServiceImpl;
import cn.authing.core.business.UserManageServiceImpl;
import cn.authing.core.business.UserServiceImpl;
import cn.authing.core.business.VerifyServiceImpl;
import cn.authing.core.init.InitUtilsKt;
import cn.authing.core.param.InitParam;
import cn.authing.core.service.OAuthService;
import cn.authing.core.service.PermissionService;
import cn.authing.core.service.UserManageService;
import cn.authing.core.service.UserService;
import cn.authing.core.service.VerifyService;
import lombok.Getter;

public class Authing {

    @Getter
    private static UserService userService;
    private static UserManageService userManageService;
    @Getter
    private static OAuthService oAuthService;
    @Getter
    private static VerifyService verifyService;
    @Getter
    private static PermissionService permissionService;

    public static void init(@NotNull InitParam param) {
        if (InitUtilsKt.getHasInit()) {
            return;
        }
        // Initialize network
        HttpHelper helper = new HttpHelper();
        // Initialize Authing
        InitUtilsKt.init(helper, param);
        // Initialize service
        initService(helper);
    }


    private static void initService(HttpHelper helper) {
        userService = new UserServiceImpl(helper);
        userManageService = new UserManageServiceImpl(helper);
        oAuthService = new OAuthServiceImpl(helper);
        verifyService = new VerifyServiceImpl(helper);
        permissionService = new PermissionServiceImpl(helper);
    }

    public static void destroy() {
        userService = null;
        userManageService = null;
        oAuthService = null;
        verifyService = null;
        permissionService = null;
        InitUtilsKt.destroy();
    }

    public static UserManageService getUserManageService() {
        return userManageService;
    }
}
