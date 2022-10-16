package com.ruoyi.project.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.mapper.HisDepartmentMapper;
import com.ruoyi.project.system.domain.HisDepartment;
import com.ruoyi.project.system.service.IHisDepartmentService;

/**
 * 科室信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-10-15
 */
@Service
public class HisDepartmentServiceImpl implements IHisDepartmentService 
{
    @Autowired
    private HisDepartmentMapper hisDepartmentMapper;

    /**
     * 查询科室信息
     * 
     * @param departmentId 科室信息主键
     * @return 科室信息
     */
    @Override
    public HisDepartment selectHisDepartmentByDepartmentId(Long departmentId)
    {
        return hisDepartmentMapper.selectHisDepartmentByDepartmentId(departmentId);
    }

    /**
     * 查询科室信息列表
     * 
     * @param hisDepartment 科室信息
     * @return 科室信息
     */
    @Override
    public List<HisDepartment> selectHisDepartmentList(HisDepartment hisDepartment)
    {
        return hisDepartmentMapper.selectHisDepartmentList(hisDepartment);
    }

    /**
     * 新增科室信息
     * 
     * @param hisDepartment 科室信息
     * @return 结果
     */
    @Override
    public int insertHisDepartment(HisDepartment hisDepartment)
    {
        hisDepartment.setCreateTime(DateUtils.getNowDate());
        return hisDepartmentMapper.insertHisDepartment(hisDepartment);
    }

    /**
     * 修改科室信息
     * 
     * @param hisDepartment 科室信息
     * @return 结果
     */
    @Override
    public int updateHisDepartment(HisDepartment hisDepartment)
    {
        hisDepartment.setUpdateTime(DateUtils.getNowDate());
        return hisDepartmentMapper.updateHisDepartment(hisDepartment);
    }

    /**
     * 批量删除科室信息
     * 
     * @param departmentIds 需要删除的科室信息主键
     * @return 结果
     */
    @Override
    public int deleteHisDepartmentByDepartmentIds(Long[] departmentIds)
    {
        return hisDepartmentMapper.deleteHisDepartmentByDepartmentIds(departmentIds);
    }

    /**
     * 删除科室信息信息
     * 
     * @param departmentId 科室信息主键
     * @return 结果
     */
    @Override
    public int deleteHisDepartmentByDepartmentId(Long departmentId)
    {
        return hisDepartmentMapper.deleteHisDepartmentByDepartmentId(departmentId);
    }
}
