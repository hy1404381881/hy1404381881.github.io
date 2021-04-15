package com.lizy.share.mapper;

import com.lizy.share.entity.Permission;
import com.lizy.share.entity.Role;
import com.lizy.share.entity.RolePermission;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
    
    int deleteByRole(Role role);
    
    int deleteByPermission(Permission permission); 
}