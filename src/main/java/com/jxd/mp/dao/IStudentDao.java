package com.jxd.mp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.mp.model.Emp;
import com.jxd.mp.model.Student;

import java.util.Map;

/**
 * @Author: Lk
 * @DateTime: 2020/12/24 18:16
 * @Description:
 */
public interface IStudentDao extends BaseMapper<Student> {

    IPage<Map<String,Object>> selectStus(Page<Map<String,Object>> pages);
}
