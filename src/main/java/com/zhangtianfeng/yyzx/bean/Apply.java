package com.zhangtianfeng.yyzx.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Apply {
    private Integer id;
    private String patient_id;
    private String patient_name;
    private String during_time;
    private String wait_time;
    private String room_id;
    private String room_position;
    private String room_type;
    private Date start_time;
    private Date end_time;
    private Date actually_starttime;
}
