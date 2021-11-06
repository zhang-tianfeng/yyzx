package com.zhangtianfeng.yyzx.bean;

import lombok.Data;

@Data
public class Menu {
    private Integer id;
    private String menu_name;
    private String parent_id;
    private String power;
    private String address;
    private String type;
    private String max;
    private String rare;
    private String rare_room;
    private String remarks;
    private String parent_name;
    private Menu_link menu_link;
}
