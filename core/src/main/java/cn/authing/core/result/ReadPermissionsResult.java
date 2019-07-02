package cn.authing.core.result;

import java.util.List;

import lombok.Getter;

@Getter
public class ReadPermissionsResult {

    private int totalCount;
    private List<Data> list;

    @Getter
    public static class Data {
        private RoleInfoResult group;
    }
}
