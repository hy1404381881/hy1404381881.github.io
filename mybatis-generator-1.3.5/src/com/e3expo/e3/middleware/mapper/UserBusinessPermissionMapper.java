package com.e3expo.e3.middleware.mapper;

import com.e3expo.e3.model.UserBusinessPermission;

public interface UserBusinessPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBusinessPermission record);

    int insertSelective(UserBusinessPermission record);

    UserBusinessPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBusinessPermission record);

    int updateByPrimaryKey(UserBusinessPermission record);
}