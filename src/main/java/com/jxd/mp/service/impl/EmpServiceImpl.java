package com.jxd.mp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.mp.dao.IEmpDao;
import com.jxd.mp.model.Emp;
import com.jxd.mp.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmpServiceImpl extends ServiceImpl<IEmpDao, Emp> implements IEmpService {

    @Autowired
    private IEmpDao empDao;

    @Override
    public IPage<Emp> selectPage(Page<Emp> page) {
        return empDao.selectPage(page);
    }

    /**
     *
     * @param limit
     * @param page
     * @return map中除了存放列表数据外，还需要存放总天数
     */
    @Override
    public Map<String,Object>  selectEmpsWithDept(int limit ,int page, String ename) {
        //构造分页对象
        Page<Map<String,Object>> pages = new Page<>(page,limit);
        //将分页对象传递到dao层
        Map<String,Object> map = new HashMap<>();

        //调用dao层获取数据
        IPage<Map<String,Object>> result = empDao.selectEmpsWithDept(pages,ename);

        map.put("emps",result.getRecords());
        map.put("total",result.getTotal());
        map.put("pageCount",result.getPages());

        return map;
    }
}
