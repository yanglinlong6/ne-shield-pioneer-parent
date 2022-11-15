package cn.com.glsx.admin.common.enums;

import lombok.Getter;

/**
 * @author payu
 */
@Getter
public enum UserGlobalType {

    NORMAL(0, "普通用户"), SUPER_ADMIN(1, "超级管理员"), TENANT_ADMIN(2, "租户管理员");

    private Integer type;
    private String name;

    UserGlobalType(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

}
