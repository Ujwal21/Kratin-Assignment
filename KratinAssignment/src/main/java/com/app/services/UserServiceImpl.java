package com.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.entities.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
//	List<User> list;
	
 

	@Override
	public List<User> getUser() {

		return userDao.findAll();
	}
	
	
	@Override
	public User addUser(User user) {

//		list.add(user);
		 userDao.save(user);
		 return user;
	}

	@Override
	public User updateUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public void deleteUser(long parseLong) {

        userDao.deleteById(parseLong);	
		
	}


}
