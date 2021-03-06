package com.air.javase.mybatisstudy;

import com.air.javase.mybatisstudy.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author:RenJIE(Air)
 * @Date:2021/1/12 - 7:35 下午
 * @Description:com.air.javase.mybatisstudy
 * @version: 1.0
 */
public class MyAPP{
    public static void main(String[] args) throws IOException {
        //    访问mybatis读取student数据
//    1. 定义mybatis主配置文件的名称
        String config = "mybatis.xml";
//    读取这个文件
        InputStream inputStream = Resources.getResourceAsStream(config);
//        创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(inputStream);
//        【重要】获取SQLSession对象，从SqlSessionFactory中获取
        SqlSession sqlSession = factory.openSession();
//        【重要】指定要执行的sql语句的标识。sql映射文件中的namespace +"."+标签的id值
        String sqlId = "com.air.javase.mybatisstudy.dao.StudentDao.selectStudents";
//        执行sql语句，通过sqlId找到语句
        List<Student> list=sqlSession.selectList(sqlId);
//        输出结果
        list.forEach(student -> System.out.println(student));
//        关闭sqlSession对象
        sqlSession.close();
    }
}
