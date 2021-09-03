package com.wy.dao;

import com.wy.entity.School;

import java.util.List;

public interface StudentDao {
    public abstract List<School> getListByName(String sname);
}
