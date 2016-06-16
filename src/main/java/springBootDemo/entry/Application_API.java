package springBootDemo.entry;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import springBootDemo.action.HelloWorldAction;

@SpringBootApplication
public class Application_API {

	public static void main(String[] args) {

		/**
		 * 创建API
		 */
		new SpringApplicationBuilder()
	    .showBanner(false)
	    .sources(HelloWorldAction.class)
	    .child(Application_API.class)
	    .run(args);
	}
}
