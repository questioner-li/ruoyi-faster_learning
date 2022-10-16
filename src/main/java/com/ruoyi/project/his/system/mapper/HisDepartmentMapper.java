package com.ruoyi.project.his.system.mapper;

import com.ruoyi.project.his.system.domain.HisDepartment;

import java.util.List;

public interface HisDepartmentMapper {

    //动态查询科室信息
    public List<HisDepartment> selectDepartmentList(HisDepartment hisDepartment);
}
