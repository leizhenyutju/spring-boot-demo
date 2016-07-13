package springBootDemo.controller;

import javax.annotation.Resource;

import springBootDemo.dao.UserDao;
import springBootDemo.mapper.UserMapper;

public class UserController {

	@Resource
	private UserMapper userMapper;
	
	public UserDao getById() {
		return new UserDao();
	}
}
