package com.air.javase.mybatisstusy;

import com.air.javase.mybatisstusy.dao.StudentDao;
import com.air.javase.mybatisstusy.dao.impl.StudentDaoImpl;
import com.air.javase.mybatisstusy.entity.Student;

import java.util.List;

/**
 * @Author:RenJIE(Air)
 * @Date:2021/1/12 - 9:44 下午
 * @Description:com.air.javase.mybatisstusy
 * @version: 1.0
 */
public class AppTest {
    public static void main(String[] args) {
        StudentDao dao = new StudentDaoImpl();
        List<Student> list= dao.selectStudents();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
