package com.ruoyi.project.his.system.service;

import com.ruoyi.project.his.system.domain.HisDepartment;

import java.util.List;

public interface IHisDepartmentService {
    /**
     *
     * @param hisDepartment
     * @return
     */
    public List<HisDepartment> selectDepartmentList(HisDepartment hisDepartment);
}
