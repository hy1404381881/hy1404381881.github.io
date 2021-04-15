package com.lizy.api.permission;

import com.lizy.share.entity.Permission;
import com.lizy.share.entity.form.PageData;
import com.lizy.share.entity.form.PermissionPageData;

public interface IPermissionService {
	  void delete(Permission permission);
	  int add(Permission permission);
	  int update(Permission permission);
	  PageData getPageData(PermissionPageData pageData);
}
