package com.air.javase.mybatisstudy;

import com.air.javase.mybatisstudy.entity.Student;
import com.air.javase.mybatisstudy.utils.MyBatisutil;
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
public class MyAPP2 {
    public static void main(String[] args) throws IOException {
      SqlSession sqlSession = MyBatisutil.getSqlSession(true);
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
