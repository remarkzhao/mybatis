package com.zhaobo.entity;

import java.io.Serializable;


public class Dept implements Serializable {
    private Integer deptno;
    private String dname;
    private String loc;
    public Dept(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dept dept = (Dept) o;
        return deptno.equals(dept.deptno) &&
                dname.equals(dept.dname) &&
                loc.equals(dept.loc);
    }

    @Override
    public int hashCode() {
        return deptno;
    }
}
