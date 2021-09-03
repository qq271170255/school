package com.wy.dao.impl;

import com.wy.dao.StudentDao;
import com.wy.entity.School;
import com.wy.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.SQLException;
import java.util.List;
public class StudentDaoImpl implements StudentDao {
    QueryRunner qr = JdbcUtil.getQr();
    public List<School> getListByName(String sname){
        String sql = "select * from school where sname like '%"+sname+ "%'";

        List<School> list = null;
        try {
            list = qr.query(sql, new BeanListHandler<School>(School.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
