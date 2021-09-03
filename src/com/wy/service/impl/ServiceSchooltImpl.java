package com.wy.service.impl;

import com.wy.dao.StudentDao;
import com.wy.dao.impl.StudentDaoImpl;
import com.wy.entity.School;
import com.wy.service.ServiceSchool;


import java.util.List;

public class ServiceSchooltImpl implements ServiceSchool {
    StudentDao studentDao = new StudentDaoImpl();
    public List<School> getSchoolbyName(String sname){
        return studentDao.getListByName(sname);
    }
}
