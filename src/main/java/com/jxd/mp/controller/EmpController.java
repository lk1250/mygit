package com.jxd.mp.controller;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.mp.model.Emp;
import com.jxd.mp.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmpController {

    @Autowired
    private IEmpService empService;

    @RequestMapping("/getAllEmp")
    @ResponseBody
    public List<Emp>  getAll(){
        //添加查询条件
        AbstractWrapper wrapper = new QueryWrapper();
        String name = "崔";
        wrapper.like("ename",name); //包含这个字的人
//        wrapper.likeLeft("ename",name) //姓崔的人

//        wrapper.like("ename","崔");
//        wrapper.like("sex","女");//默认使用and关联

        wrapper.like("ename","崔");
        wrapper.or();
        wrapper.like("sex","女");

//        Map<String,String> map = new HashMap<>();
//        map.put("ename","崔");
//        map.put("sex","女");
//        wrapper.allEq(map); //ename = "崔" and sex = "女"


        return empService.list(wrapper);
    }


    @RequestMapping("/getByPage")
    @ResponseBody
    public List<Emp> getByPage(){
        //创建page对象
        Page<Emp> page = new Page<>(1,1); //1 当前页码  5代表每页显示条数
        IPage<Emp> pageData = empService.selectPage(page);

        List<Emp> list = pageData.getRecords();//当前页的数据
        pageData.getCurrent();//当前页码
        pageData.getTotal();//表中所有的数据
        pageData.getSize();//每页显示条数
        pageData.getPages(); //一共几页
        return list;
    }


    @RequestMapping("/delByIds")
    @ResponseBody
    public String delByIds(Integer[] enpnos){
        //直降将数组转为list
        List<Integer> idList = Arrays.asList(enpnos);
        empService.removeByIds(idList);
        return "success";

    }



}
