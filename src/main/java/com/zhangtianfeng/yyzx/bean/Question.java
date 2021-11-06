package com.zhangtianfeng.yyzx.bean;

import lombok.Data;

@Data
public class Question {
    private Integer question_id;
    private String title;
    private String selectA;
    private String selectB;
    private String selectC;
    private String type;
}
