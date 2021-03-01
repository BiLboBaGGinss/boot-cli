package com.pan.bootcli.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取项目相关配置
 *
 * @author Pan
 */
@Component
@ConfigurationProperties(prefix = "bootcli")
@Data
public class BootCliConfig {
    /** 项目名称 */
    private String name;

    /** 版本 */
    private String version;

    /** 版权年份 */
    private String copyrightYear;

    /** 获取地址开关 */
    private static boolean addressEnabled;

    public static boolean isAddressEnabled()
    {
        return addressEnabled;
    }
}
