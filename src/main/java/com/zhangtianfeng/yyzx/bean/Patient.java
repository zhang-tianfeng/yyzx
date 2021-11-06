package com.zhangtianfeng.yyzx.bean;

import lombok.Data;

@Data
public class Patient {
    private String name;
    private String idcard;
    private String sex;
    private String phone;
    private String birthday;
    private String emergency;
    private String ephone;
    private String state = "0";
}