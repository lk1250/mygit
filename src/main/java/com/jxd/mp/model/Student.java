package com.jxd.mp.model;

/**
 * @Author: Lk
 * @DateTime: 2020/12/24 18:24
 * @Description:
 */
public class Student {
    private int studentId;
    private String sname;
    private String ssex;
    private String sbirthday;
    private String grade; // 入学时间
    private int collegeId; //学院编号

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public Student() {
    }

    public Student(int studentId, String sname, String ssex, String sbirthday, String grade, int collegeId) {
        this.studentId = studentId;
        this.sname = sname;
        this.ssex = ssex;
        this.sbirthday = sbirthday;
        this.grade = grade;
        this.collegeId = collegeId;
    }
}
