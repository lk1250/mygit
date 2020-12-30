package com.jxd.mp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.mp.model.Emp;

import java.util.List;
import java.util.Map;

public interface IEmpService extends IService<Emp> {

    IPage<Emp> selectPage(Page<Emp> page);


    Map<String,Object> selectEmpsWithDept(int limit ,int page , String ename);
}
