package com.pan.bootcli.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SysUser {
    @TableId
    private Long id;
    private String account;
    private String password;
    private String username;
}
