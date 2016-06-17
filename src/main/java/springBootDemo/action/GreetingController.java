package springBootDemo.action;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springBootDemo.model.Greeting;


@RestController
@EnableAutoConfiguration //自动加载配置
public class GreetingController {

	private static final String template = "Hello, %s!";
	
	private final AtomicLong counterLong = new AtomicLong();//long类型自增id(线程安全)
	
	@RequestMapping("/greeting")
	public Greeting getGreeting(@RequestParam(value="name",defaultValue="world") String name) {
		return new Greeting(counterLong.incrementAndGet(), String.format(template, name));
	}
}
