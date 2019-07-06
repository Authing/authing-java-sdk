package cn.authing.core.result;

import java.util.List;

import lombok.Getter;

@Getter
public class ReadRolesResult {

    private int totalCount;
    private List<RoleInfoResult> list;
}
