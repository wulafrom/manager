package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-09-22 17:47
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll(Integer userage);
}
