package springBootDemo.entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import springBootDemo.action.GreetingController;
import springBootDemo.action.ScheduledController;

@SpringBootApplication
@EnableScheduling
public class Application_multiple {

	public static void main(String[] args) {
		/**
		 * 多个rest同时启动
		 */
		Object[]  sources = {Application_multiple.class,GreetingController.class,ScheduledController.class};
		SpringApplication.run(sources, args);
	}
}
