package com.zhaobo.Mapper;

import com.zhaobo.entity.Dept;

import java.util.List;

public interface DeptMapper {
    public Dept findById(int id);
    public List<Dept> findAll();
    public void save(Dept dept);
    public void deleteById(int id);
    public void update(String args);
}
