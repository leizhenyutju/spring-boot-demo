package springBootDemo.mapper;

import java.util.List;

import springBootDemo.common.BaseCommonMapper;
import springBootDemo.dao.UserDao;

public interface UserMapper extends BaseCommonMapper<UserDao>{

	public UserDao getById(Long id);
	
	public String getNameById(Long id);
	
	public List<UserDao> queryAll();
}
