package com.zhangtianfeng.yyzx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhangtianfeng.yyzx.bean.Patient;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PatientMapper extends BaseMapper<Patient> {
}
