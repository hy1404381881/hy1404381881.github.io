package com.lizy.service.permission;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lizy.api.permission.IPermissionService;
import com.lizy.share.entity.Permission;
import com.lizy.share.entity.form.PageData;
import com.lizy.share.entity.form.PermissionPageData;
import com.lizy.share.enums.IsDelEnum;
import com.lizy.share.exception.custom.MyException;
import com.lizy.share.exception.custom.MyException.UserExceptionRemark;
import com.lizy.share.mapper.PermissionMapper;
import com.lizy.share.mapper.RolePermissionMapper;
@Service
public class PermissionService implements IPermissionService {
	@Autowired
	private PermissionMapper permissionMapper;
	@Autowired
	private RolePermissionMapper rolePermissionMapper;

	@Override
	@Transactional
	public void delete(Permission permission) {
		// TODO Auto-generated method stub
		// 首先删除persmission表里的信息，接着删除role-permission表里的信息
		permission.setIsDel(IsDelEnum.Deleted.getIsDel());
        permissionMapper.updateByPrimaryKey(permission);
        rolePermissionMapper.deleteByPermission(permission);
	}

	@Override
	public int add(Permission permission) {
		// TODO Auto-generated method stub
		List<Permission> permissions=permissionMapper.selectByPermission(permission);
		if(permissions==null || permissions.size()==0 ) {
			return permissionMapper.insertSelective(permission);
		}else {
			throw new MyException(UserExceptionRemark.USER_PERMISSION_EXISTED);
		}
	}

	@Override
	public int update(Permission permission) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageData getPageData(PermissionPageData pageData) {
		// TODO Auto-generated method stub
		pageData.setTotal(permissionMapper.selectPagedDataNum(pageData));
		pageData.setRows(permissionMapper.selectPagedData(pageData));
		return pageData;
	}

}
