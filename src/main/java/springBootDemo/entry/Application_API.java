package springBootDemo.entry;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import springBootDemo.action.GreetingController;

@SpringBootApplication
public class Application_API {

	public static void main(String[] args) {

		/**
		 * 创建API
		 */
		new SpringApplicationBuilder()
	    .showBanner(false)
	    .sources(GreetingController.class)
	    .child(Application_API.class)
	    .run(args);
	}
}
