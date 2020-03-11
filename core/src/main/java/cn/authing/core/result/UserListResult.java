package cn.authing.core.result;

import java.util.List;

import lombok.Getter;

@Getter
public class UserListResult {
    private int totalCount;
    private List<UserInfoResult> list;
}
 