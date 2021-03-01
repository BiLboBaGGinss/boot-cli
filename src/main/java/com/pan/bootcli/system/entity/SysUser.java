package com.pan.bootcli.system.entity;

import lombok.Data;

@Data
public class SysUser {
    private long id;
    private String account;
    private String password;
    private String username;
}
