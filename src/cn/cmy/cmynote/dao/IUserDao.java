package cn.cmy.cmynote.dao;

import cn.cmy.cmynote.dao.IDao.AsyncCallback;

public interface IUserDao {

	/**
	 * ע���û�
	 */
	void userRegister(String username, String password, String phonenumber, String email, AsyncCallback callback);

	/**
	 * �û���½
	 */
	void UserLogin(String username, String password, AsyncCallback callback);
	
}
