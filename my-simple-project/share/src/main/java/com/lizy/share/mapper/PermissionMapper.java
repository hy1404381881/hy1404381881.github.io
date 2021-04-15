package com.lizy.share.mapper;

import java.util.List;

import com.lizy.share.entity.Permission;
import com.lizy.share.entity.form.PermissionPageData;

public interface PermissionMapper {
	List<Permission> selectByPermission(Permission permission);
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
    List<Permission> selectPagedData(PermissionPageData pageData);
    int selectPagedDataNum(PermissionPageData pageData);
}