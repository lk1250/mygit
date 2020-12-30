package com.jxd.mp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Map;

/**
 * @Author: Lk
 * @DateTime: 2020/12/24 18:20
 * @Description:
 */
public interface IStuService {


    Map<String,Object> selectStuWithDept(int limit ,int page);
}
