package org.NagarroProjects.service;

import org.NagarroProjects.dao.UserDao;
import org.NagarroProjects.dto.User;
import org.springframework.beans.factory.annotation.Autowired;


public class UserService {

	@Autowired
	private UserDao userdao;
	
	public boolean validateUser(String uId, String uPswd) {
		
		User user = userdao.getUser(uId);

		return user != null && user.getuPswd().equals(uPswd);		//if user null returns 0 else returns 1
		
	}
}

