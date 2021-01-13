package com.air.javase.mybatisstudy.dao;

import com.air.javase.mybatisstudy.entity.Student;

import java.util.List;

/**
 * @Author:RenJIE(Air)
 * @Date:2021/1/12 - 6:48 下午
 * @Description:com.air.javase.mybatisstudy.entity.dao
 * @version: 1.0
 */
public interface StudentDao {
//    查询student表中的所有数据
    public List<Student> selectStudents();
//    插入数据方法
//    参数：student，表示要插入到数据库的数据
//    返回值：int，表示执行insert操作后的影响数据库的行数
    public int insertStudent(Student student);
}
