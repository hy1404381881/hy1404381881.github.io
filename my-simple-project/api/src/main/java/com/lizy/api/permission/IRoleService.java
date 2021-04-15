package com.lizy.api.permission;

import com.lizy.share.entity.Role;
import com.lizy.share.entity.form.PageData;
import com.lizy.share.entity.form.RolePageData;

public interface IRoleService {
	  void delete(Role record);
	  int add(Role record);
	  int update(Role record);
	  PageData getPageData(RolePageData pageData);
	  
	  
	   

}
