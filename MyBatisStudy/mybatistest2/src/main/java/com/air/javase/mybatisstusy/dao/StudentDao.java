package com.air.javase.mybatisstusy.dao;

import com.air.javase.mybatisstusy.entity.Student;

import java.util.List;

/**
 * @Author:RenJIE(Air)
 * @Date:2021/1/12 - 9:20 下午
 * @Description:com.air.javase.mybatisstusy.dao
 * @version: 1.0
 */
public interface StudentDao {
    List<Student> selectStudents();
}
