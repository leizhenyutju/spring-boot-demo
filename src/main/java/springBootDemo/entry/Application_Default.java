package springBootDemo.entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application_Default {
	/**
	 * 
	 * SpringApplication的构造器参数往往是一个类.class，而这个类一定是加有@Configuration注解的
	 * 另外还可以换成xml的配置路径哦，前面有写出来过
	 * SpringApplication.run("classpath:/META-INF/application-context.xml",args);
	 * 
	 * @param args
	 * 
	 * @author fuhw
	 * @date 2016年6月16日 下午4:34:34
	 */
	public static void main(String[] args) {
		/**
		 * 默认启动
		 */
		SpringApplication.run(Application_Default.class, args);
	
	}

}
