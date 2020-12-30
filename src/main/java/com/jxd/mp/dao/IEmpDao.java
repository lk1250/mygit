package com.jxd.mp.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.mp.model.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IEmpDao extends BaseMapper<Emp> {

   IPage<Emp> selectPage(Page<Emp> page);

   IPage<Map<String,Object>> selectEmpsWithDept(Page<Map<String,Object>> pages , @Param("ename") String ename);
}
