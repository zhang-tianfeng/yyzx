package com.zhangtianfeng.yyzx.bean;

import lombok.Data;

import java.util.List;

@Data
public class ResultMsg {
    private Integer code;
    private String msg;
    private List<Work> list;
    private Work w;
    private List<Menu> menulist;
    private Patient p;
    private Demo d;
    private List<Link> linklist;
    private Question q;
    private List<Demo> demolist;
}
