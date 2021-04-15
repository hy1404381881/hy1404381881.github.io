package com.lizy.share.mapper;

import java.util.List;

import com.lizy.share.entity.Permission;
import com.lizy.share.entity.User;
import com.lizy.share.entity.form.UserPageData;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    User getUserAndRolesByLoginNameAndPassword(User user);
    User getUserByMobile(String mobile);
    User getUserByLoginName(String loginName);
    User getUserAndRolesByLoginName(String loginName);
    List<Permission> getPermissionByUser(User user);
    List<User> selectPagedData(UserPageData userPageData);
    int selectPagedDataNum(UserPageData userPageData); 
    List<User> selectByUser(User user);
    
}