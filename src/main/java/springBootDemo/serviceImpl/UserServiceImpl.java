package springBootDemo.serviceImpl;

import org.springframework.stereotype.Service;

import springBootDemo.entity.User;
import springBootDemo.mapper.UserMapper;
import springBootDemo.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,UserMapper> implements UserService{

}
