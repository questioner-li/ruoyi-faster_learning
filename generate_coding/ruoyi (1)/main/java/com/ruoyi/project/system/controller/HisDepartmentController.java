package com.ruoyi.project.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.domain.HisDepartment;
import com.ruoyi.project.system.service.IHisDepartmentService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 科室信息Controller
 * 
 * @author ruoyi
 * @date 2022-10-15
 */
@RestController
@RequestMapping("/system/department")
public class HisDepartmentController extends BaseController
{
    @Autowired
    private IHisDepartmentService hisDepartmentService;

    /**
     * 查询科室信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:department:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisDepartment hisDepartment)
    {
        startPage();
        List<HisDepartment> list = hisDepartmentService.selectHisDepartmentList(hisDepartment);
        return getDataTable(list);
    }

    /**
     * 导出科室信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:department:export')")
    @Log(title = "科室信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HisDepartment hisDepartment)
    {
        List<HisDepartment> list = hisDepartmentService.selectHisDepartmentList(hisDepartment);
        ExcelUtil<HisDepartment> util = new ExcelUtil<HisDepartment>(HisDepartment.class);
        util.exportExcel(response, list, "科室信息数据");
    }

    /**
     * 获取科室信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:department:query')")
    @GetMapping(value = "/{departmentId}")
    public AjaxResult getInfo(@PathVariable("departmentId") Long departmentId)
    {
        return AjaxResult.success(hisDepartmentService.selectHisDepartmentByDepartmentId(departmentId));
    }

    /**
     * 新增科室信息
     */
    @PreAuthorize("@ss.hasPermi('system:department:add')")
    @Log(title = "科室信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisDepartment hisDepartment)
    {
        return toAjax(hisDepartmentService.insertHisDepartment(hisDepartment));
    }

    /**
     * 修改科室信息
     */
    @PreAuthorize("@ss.hasPermi('system:department:edit')")
    @Log(title = "科室信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HisDepartment hisDepartment)
    {
        return toAjax(hisDepartmentService.updateHisDepartment(hisDepartment));
    }

    /**
     * 删除科室信息
     */
    @PreAuthorize("@ss.hasPermi('system:department:remove')")
    @Log(title = "科室信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{departmentIds}")
    public AjaxResult remove(@PathVariable Long[] departmentIds)
    {
        return toAjax(hisDepartmentService.deleteHisDepartmentByDepartmentIds(departmentIds));
    }
}
