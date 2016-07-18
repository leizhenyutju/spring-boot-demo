package springBootDemo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springBootDemo.dao.UserDao;
import springBootDemo.mapper.UserMapper;

@RestController
@RequestMapping("/sys/user")
public class UserController {

	@Resource
	private UserMapper userMapper;
	
	
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserDao getById(@PathVariable Long id) {
		return userMapper.getById(id);
	}
	
	@RequestMapping(value = "/name/{id}", method = RequestMethod.GET)
	public String getNameById(@PathVariable Long id) {
		return userMapper.getNameById(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "/query",method = RequestMethod.GET)
	public List<UserDao> queryAll() {
		return userMapper.queryAll();
	}
}
