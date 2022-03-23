package org.NagarroProjects.daoImp;

import org.NagarroProjects.dao.Dao;
import org.NagarroProjects.dao.UserDao;
import org.NagarroProjects.dto.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImp implements UserDao { //userDaoImp class implements UserDao.java interface

	@Autowired
	private Dao dao;

	public User getUser(String uId) {
		
		dao.begin();
		User user = (User) dao.getSession().get(User.class, uId);
		dao.commit();
		dao.close();

		return user;
	}
	
}

