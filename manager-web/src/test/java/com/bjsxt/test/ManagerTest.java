package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-09-22 17:18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUsersTest() {
        Users users = new Users();
        users.setUserage(18);
        users.setUsername("三哥");
        this.usersMapper.insertUser(users);
    }

    @Test
    public void selectUsers() {
        List<Users> list = this.usersMapper.selectUserAll(18);
        Iterator<Users> iterator =  list.iterator();
        if (iterator.hasNext()){
            Users user = iterator.next();
            System.out.println(user.getUserid()+" "+user.getUserage()+" "+user.getUsername());
        }

    }

}
