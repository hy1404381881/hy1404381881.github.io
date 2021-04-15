package com.lizy.share.mapper;

import java.util.List;

import com.lizy.share.entity.Permission;
import com.lizy.share.entity.Role;
import com.lizy.share.entity.form.RolePageData;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    List<Permission> getPermissionByRole(Role role);
    List<Role> selectByRole(Role role);
    
    List<Role> selectPagedData(RolePageData pageData);
    
    int selectPagedDataNum(RolePageData pageData);
}