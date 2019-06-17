package cn.authing.core.result;

import java.util.List;

import lombok.Getter;

@Getter
public class UserPatchResult {
    private int totalCount;
    private List<UserInfoResult> list;
}
