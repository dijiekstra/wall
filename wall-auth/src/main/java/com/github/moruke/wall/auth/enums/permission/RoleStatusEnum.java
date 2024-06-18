package com.github.moruke.wall.auth.enums.permission;

import lombok.Getter;

public enum RoleStatusEnum {
    DEFAULT("default", (byte) 0),
    ;

    @Getter
    private final String name;
    @Getter
    private final byte code;

    RoleStatusEnum(String name, byte code) {
        this.name = name;
        this.code = code;
    }

    public static RoleStatusEnum find(Byte status) {
        for (RoleStatusEnum value : values()) {
            if (value.code == status) {
                return value;
            }
        }
        throw new IllegalArgumentException("unknown status: " + status);
    }
}
