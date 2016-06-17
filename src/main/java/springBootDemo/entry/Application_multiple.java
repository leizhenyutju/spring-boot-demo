package springBootDemo.entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springBootDemo.action.GreetingController;

@SpringBootApplication
public class Application_multiple {

	public static void main(String[] args) {
		/**
		 * 多个rest同时启动
		 */
		Object[]  sources = {Application_multiple.class,GreetingController.class};
		SpringApplication.run(sources, args);
	}
}
