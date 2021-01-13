package com.air.javase.mybatisstusy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisutil {
    private static SqlSessionFactory factory = null;

    static {
        String config = "mybatis.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(boolean commit) {
        SqlSession sqlSession = null;
        if (factory != null || commit == true) {
            sqlSession = factory.openSession(true);//自动提交事务
        } else if (factory != null || commit == false) {
            sqlSession = factory.openSession(false);//非自动提交事务
        }
        return sqlSession;
    }
}
