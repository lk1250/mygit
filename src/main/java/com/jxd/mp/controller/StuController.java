package com.jxd.mp.controller;

import com.jxd.mp.model.Users;
import com.jxd.mp.service.IEmpService;
import com.jxd.mp.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author: Lk
 * @DateTime: 2020/12/24 18:15
 * @Description:
 */
@RestController
public class StuController {

    @Autowired
    private IStuService stuService;



    @GetMapping("/getStus/{limit}/{page}")
    public Map<String,Object> getEmps(@PathVariable int limit , @PathVariable int page){
        return stuService.selectStuWithDept(limit,page);
    }


}
