package com.neusoft.test;


import com.neusoft.dao.IUserDao;
import com.neusoft.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/3 14:40
 */
public class MybatisTest1 {
    private InputStream in;
    private SqlSession session;
    private  IUserDao userDao;

    @Before
    public void test2() throws IOException {
        // 1. 读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2. 创建 SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        // 3. 使用 工厂生产的 SqlSession对象
        session = factory.openSession();
        // 4. 使用SqlSession 创建Dao 接口 的代理对象
//        userDao = session.getMapper(IUserDao.class);
//        // 5. 使用代理对象执行方法
//        List<User> users = userDao.findAll();
//        for (User user : users) {
//            System.out.println(user);
//        }
        // 6 释放资源

    }
    @After
    public void destroy() throws IOException {
        session.commit();
        session.close();
        in.close();
    }
    @Test
    public void test1() throws IOException {
        userDao = session.getMapper(IUserDao.class);
        List<User> s = userDao.findAll();
        for (User user:s) {
            System.out.println(user);
        }
    }
    @Test
    public void findFindOne() throws IOException {
        userDao = session.getMapper(IUserDao.class);
        User user = userDao.findById(41);
        System.out.println(user);

    }
}
