package com.jasongj.factory;

import com.jasongj.dao.IUserDao;
import com.jasongj.dao.MySQLUserDao;

public class MySQLDaoFactory implements IDaoFactory {

	@Override
	public IUserDao createUserDao() {
		return new MySQLUserDao();
	}

}
