package springBootDemo.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration //自动加载配置
public class CustomApplication {
	@RequestMapping("/entry")
	public String entryHome() {
		return "welcome to the home of CustomApplication!";
	}
	public static void main(String[] args) {
		SpringApplication.run(CustomApplication.class, args);
	}

}
