package com.jxd.mp.controller;

import com.jxd.mp.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lk
 * @DateTime: 2020/12/30 10:05
 * @Description:
 */
@RestController
public class MenuController {
    @Autowired
    private IMenuService menuService;

    @RequestMapping("/getAllMenu")
    public Map<String,Object> getAllMenu(){
        Map<String,Object> map = new HashMap<>();

        map.put("data",menuService.getMenu());
        map.put("status",200);
        return map;
    }
}
