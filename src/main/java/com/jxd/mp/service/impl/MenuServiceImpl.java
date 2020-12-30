package com.jxd.mp.service.impl;

import com.jxd.mp.dao.IMenuDao;
import com.jxd.mp.model.Menu;
import com.jxd.mp.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Lk
 * @DateTime: 2020/12/30 10:04
 * @Description:
 */
@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private IMenuDao menuDao;

    @Override
    public List<Menu> getMenu() {
        return menuDao.getMenu();
    }
}
