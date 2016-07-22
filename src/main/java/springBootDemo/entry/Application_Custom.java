package springBootDemo.entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springBootDemo.action.CustomApplication;
import springBootDemo.controller.IndexController;
import springBootDemo.listener.TestListener;

@SpringBootApplication
@EnableAutoConfiguration
public class Application_Custom {

	public static void main(String[] args) {
		
		/**
		 * 自定义一些应用的配置启动(对应用添加监听，入口Action)
		 */
		  SpringApplication app = new SpringApplication(CustomApplication.class,IndexController.class);
		  app.addListeners(new TestListener());
		  app.setShowBanner(false);
		  app.run(args);
		  
		  
	}
}
