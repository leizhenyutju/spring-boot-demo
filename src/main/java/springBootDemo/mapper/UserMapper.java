package springBootDemo.mapper;

import java.util.List;

import springBootDemo.dao.UserDao;

public interface UserMapper extends BaseCommonMapper<UserDao>{

	public UserDao getById(Long id);
	
	public UserDao getNameById(Long id);
	
	public List<UserDao> queryAll();
}
