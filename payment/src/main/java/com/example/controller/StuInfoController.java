package com.example.controller;

import com.example.pojo.dto.StuInfoDto;
import com.example.pojo.vo.StuInfoOperateVo;
import com.example.service.StuInfoService;
import com.example.utils.AjaxResult;
import com.example.utils.BaseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/test")
public class StuInfoController extends BaseController {
    @Autowired
    private StuInfoService stuInfoService;

    /**
     *根据classID查询数据
     */
    @GetMapping
    public List<StuInfoDto> getAll(){
        List<StuInfoDto> list= stuInfoService.getAll();
//        如msg": "操作成功"：这是一个键值对
//        return AjaxResult.success(list);
        return list;
    }

    @PostMapping
    public AjaxResult insert(@RequestBody StuInfoOperateVo stuInfoOperateVo){
//        因为toAjax不是一个类，是方法，所以要extends BaseController
        return toAjax(stuInfoService.insert(stuInfoOperateVo));
    }

//    @GetMapping("/{id}")
//    public AjaxResult delete(int id) throws Exception {
//            return toAjax(stuInfoService.delete(id));
//    }
}
