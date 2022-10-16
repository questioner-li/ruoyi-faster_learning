package com.ruoyi.project.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 科室信息对象 his_department
 * 
 * @author ruoyi
 * @date 2022-10-15
 */
public class HisDepartment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 科室ID */
    private Long departmentId;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String departmentName;

    /** 科室编码 */
    @Excel(name = "科室编码")
    private String departmentCode;

    /** 挂号量 */
    @Excel(name = "挂号量")
    private String departmentNum;

    /** 负责人 */
    @Excel(name = "负责人")
    private String departmentPerson;

    /** 手机号 */
    @Excel(name = "手机号")
    private String departmentPhone;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setDepartmentId(Long departmentId) 
    {
        this.departmentId = departmentId;
    }

    public Long getDepartmentId() 
    {
        return departmentId;
    }
    public void setDepartmentName(String departmentName) 
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() 
    {
        return departmentName;
    }
    public void setDepartmentCode(String departmentCode) 
    {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentCode() 
    {
        return departmentCode;
    }
    public void setDepartmentNum(String departmentNum) 
    {
        this.departmentNum = departmentNum;
    }

    public String getDepartmentNum() 
    {
        return departmentNum;
    }
    public void setDepartmentPerson(String departmentPerson) 
    {
        this.departmentPerson = departmentPerson;
    }

    public String getDepartmentPerson() 
    {
        return departmentPerson;
    }
    public void setDepartmentPhone(String departmentPhone) 
    {
        this.departmentPhone = departmentPhone;
    }

    public String getDepartmentPhone() 
    {
        return departmentPhone;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("departmentId", getDepartmentId())
            .append("departmentName", getDepartmentName())
            .append("departmentCode", getDepartmentCode())
            .append("departmentNum", getDepartmentNum())
            .append("departmentPerson", getDepartmentPerson())
            .append("departmentPhone", getDepartmentPhone())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
