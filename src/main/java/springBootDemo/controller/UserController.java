package springBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBootDemo.entity.User;
import springBootDemo.service.UserService;

@RestController
@RequestMapping("/sys/user")
public class UserController extends DataController<User, UserService> {

	
//	public UserController(Class<?> clazz, String moduleName) {
//		super(clazz, moduleName);
//	}

	@RequestMapping("test")
	public String test() {
		System.out.println("您进入了UserController！");
		return "您进入了UserController！";
	}
	
}
