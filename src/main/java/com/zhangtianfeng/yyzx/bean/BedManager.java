package com.zhangtianfeng.yyzx.bean;

import lombok.Data;

@Data
public class BedManager {
    private Integer id;
    private String position;
    private String start_time;
    private String end_time;
    private String state;
    private String patient_id;
    private String archive_num;
    private Patient patient;
    private Integer bulid_id;
}
