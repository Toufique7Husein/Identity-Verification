package userVarification.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import userVarification.dao.UserDao;
import userVarification.models.User;
import java.util.Collections;


@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}
	
	public List<User> getList() {
		return userDao.getAlldata();
	}
	
}
