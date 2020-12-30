package com.jxd.mp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.mp.dao.IEmpDao;
import com.jxd.mp.dao.IStudentDao;
import com.jxd.mp.model.Emp;
import com.jxd.mp.model.Student;
import com.jxd.mp.service.IEmpService;
import com.jxd.mp.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StuServiceImpl extends ServiceImpl<IStudentDao, Student> implements IStuService {

    @Autowired
    private IStudentDao studentDao;


    @Override
    public Map<String, Object> selectStuWithDept(int limit, int page) {
        //构造分页对象
        Page<Map<String,Object>> pages = new Page<>(page,limit);
        //将分页对象传递到dao层
        Map<String,Object> map = new HashMap<>();

        //调用dao层获取数据
        IPage<Map<String,Object>> result = studentDao.selectStus(pages);

        map.put("students",result.getRecords());
        map.put("total",result.getTotal());
        map.put("pageCount",result.getPages());

        return map;
    }
}
