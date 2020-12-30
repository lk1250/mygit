package com.jxd.mp.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import sun.print.PSPrinterJob;

import java.util.Date;

@TableName("emp")
public class Emp {

    @TableId("empno")
    private int empno;

    private String ename;
    private  int age;
    private String sex;
    private Date hriedate;

    @TableField("depId")
    private int depId;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public Date getHriedate() {
        return hriedate;
    }

    public void setHriedate(Date hriedate) {
        this.hriedate = hriedate;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
