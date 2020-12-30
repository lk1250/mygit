package com.jxd.mp.model;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @Author: Lk
 * @DateTime: 2020/12/25 10:45
 * @Description:
 */
public class Dept {

    @TableId("depId")
    private int depId;
    private String dname;

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
