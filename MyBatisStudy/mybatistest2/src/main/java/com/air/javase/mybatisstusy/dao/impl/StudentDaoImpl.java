package com.air.javase.mybatisstusy.dao.impl;

import com.air.javase.mybatisstusy.dao.StudentDao;
import com.air.javase.mybatisstusy.entity.Student;
import com.air.javase.mybatisstusy.utils.MyBatisutil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author:RenJIE(Air)
 * @Date:2021/1/12 - 9:40 下午
 * @Description:com.air.javase.mybatisstusy.dao.impl
 * @version: 1.0
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudents() {
        SqlSession sqlSession = MyBatisutil.getSqlSession(true);
        String sqlId = "com.air.javase.mybatisstusy.dao.StudentDao.selectStudents";
        List<Student>  list=sqlSession.selectList(sqlId);
        sqlSession.close();
        return list;
    }
}
