package com.ruoyi.project.system.mapper;

import java.util.List;
import com.ruoyi.project.system.domain.HisDepartment;

/**
 * 科室信息Mapper接口
 * 
 * @author ruoyi
 * @date 2022-10-15
 */
public interface HisDepartmentMapper 
{
    /**
     * 查询科室信息
     * 
     * @param departmentId 科室信息主键
     * @return 科室信息
     */
    public HisDepartment selectHisDepartmentByDepartmentId(Long departmentId);

    /**
     * 查询科室信息列表
     * 
     * @param hisDepartment 科室信息
     * @return 科室信息集合
     */
    public List<HisDepartment> selectHisDepartmentList(HisDepartment hisDepartment);

    /**
     * 新增科室信息
     * 
     * @param hisDepartment 科室信息
     * @return 结果
     */
    public int insertHisDepartment(HisDepartment hisDepartment);

    /**
     * 修改科室信息
     * 
     * @param hisDepartment 科室信息
     * @return 结果
     */
    public int updateHisDepartment(HisDepartment hisDepartment);

    /**
     * 删除科室信息
     * 
     * @param departmentId 科室信息主键
     * @return 结果
     */
    public int deleteHisDepartmentByDepartmentId(Long departmentId);

    /**
     * 批量删除科室信息
     * 
     * @param departmentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHisDepartmentByDepartmentIds(Long[] departmentIds);
}
