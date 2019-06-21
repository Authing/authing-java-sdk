package cn.authing.core.result;

import java.util.List;

import lombok.Getter;

@Getter
public class UserLoginHistory {
    private int totalCount;
    private List<LoginRecord> list;

}
