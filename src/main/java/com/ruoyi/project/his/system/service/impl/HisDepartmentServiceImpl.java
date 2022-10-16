package com.ruoyi.project.his.system.service.impl;

import com.ruoyi.project.his.system.domain.HisDepartment;
import com.ruoyi.project.his.system.mapper.HisDepartmentMapper;
import com.ruoyi.project.his.system.service.IHisDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HisDepartmentServiceImpl implements IHisDepartmentService {
    //声明mapper层属性
    @Autowired
    private HisDepartmentMapper hisDepartmentMapper;

    @Override
    public List<HisDepartment> selectDepartmentList(HisDepartment hisDepartment) {
        return hisDepartmentMapper.selectDepartmentList(hisDepartment);
    }
}
