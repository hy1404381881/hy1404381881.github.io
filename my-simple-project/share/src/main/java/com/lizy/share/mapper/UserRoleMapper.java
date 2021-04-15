package com.lizy.share.mapper;

import com.lizy.share.entity.Role;
import com.lizy.share.entity.User;
import com.lizy.share.entity.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
    
    int deleteByRole(Role role);
    
    int deleteByUser(User user);
}