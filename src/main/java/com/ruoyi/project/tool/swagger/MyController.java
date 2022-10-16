package com.ruoyi.project.tool.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("科室信息管理")
@RestController
@RequestMapping("/test/my")
public class MyController {
    @ApiOperation("查询客户信息")
    @GetMapping("userList")
    public User userList(String kname,String kdesc){
        return new User(1,"张三","唱歌");
    }
}
