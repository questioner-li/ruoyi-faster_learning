package com.ruoyi.project.his.system.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.his.system.domain.HisDepartment;
import com.ruoyi.project.his.system.service.IHisDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/his/department")
public class HisDepartmentController extends BaseController {

    //声明业务层
    @Autowired
    private IHisDepartmentService hisDepartmentService;

    /**
     * 获取科室列表
     */
    @PreAuthorize("@ss.hasPermi('system:department:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisDepartment hisDepartment)
    {
        startPage();
        List<HisDepartment> hisDepartments = hisDepartmentService.selectDepartmentList(hisDepartment);

        return getDataTable(hisDepartments);
    }

}
