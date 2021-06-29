package com.example.demo.repository;

import com.example.demo.entity.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/**
 * @author 14043
 */
@Repository
public class UserRepository {

    public User findUserById(Long id) {
        return newUser();
    }

    public User save(User user) {
        return newUser();
    }

    public User saveAndFlush(User user) {
        return newUser();
    }

    public int deleteById(long id) {
        return 0;
    }

    public Page<User> pageList(String key, Date startDate, Date endDate, Pageable pageable) {
        Page<User> pageUser = new PageImpl<User>(newListUser(), pageable, 100);
        return pageUser;
    }

    public Page<User> findAll(Pageable pageable) {
        Page<User> pageUser = new PageImpl<User>(newListUser(), pageable, 100);
        return pageUser;
    }

    private User newUser() {
        User user = new User();
        user.setId(101);
        user.setUsername("用户名");
        user.setAddress("上海市恒定路1990号");
        user.setGender("男人");
        user.setMobile("1880001111");
        user.setRealName("测试名");
        return user;
    }

    private List<User> newListUser() {
        int num = 20;
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            User user = newUser();
            user.setId(i);
            user.setUsername("测试名" + i);
            userList.add(user);
        }
        return userList;
    }


}
