package test;

import com.neusoft.dao.AccountDao;
import com.neusoft.domain.Account;
import com.neusoft.domain.AccountUser;
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
 * @author Eric Lee
 * @date 2020/9/3 10:13
 */
public class MybatisTest2 {
    private  InputStream in;
    private  SqlSession sqlSession;
    private AccountDao accountDao;
    // 在测试方法之前执行
    @Before
    public void init() throws IOException {
        // 1. 读取配置文件
         in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2. 创建 SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        // 3. 使用 工厂生产的 SqlSession对象
        sqlSession = factory.openSession();
        // 4. 使用SqlSession 创建Dao 接口 的代理对象
        accountDao = sqlSession.getMapper(AccountDao.class);
    }
    @After
    public void destroy() throws IOException {
        // 提交事物
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void testCount(){
        List<AccountUser> list=accountDao.findUser();
        for (AccountUser user:list){
            System.out.println(user);
        }
    }
    @Test
    public void testCoun(){
        List<Account> list=accountDao.findAll();
        for (Account user:list){
            System.out.println("每个账户信息");
            System.out.println(user);
            System.out.println(user.getUser());
        }
    }
    @Test
    public void testbyid(){
        Account account=accountDao.findById(1);
        System.out.println(account);
        System.out.println(account.getUser());
    }

}
