package springBootDemo.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;



public class TestListener implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent arg0) {
		/**
		 * 做监听事件的业务处理
		 * 1.ApplicationStartedEvent在初始化的时候发送事件
		 * 2.ApplicationEnvironmentPreparedEvent 在创建上下文前发送事件
		 * 3.ApplicationPreparedEvent 在应用准备之前，在bean加载之后发送事件
		 * 4.ApplicationFailedEvent 启动失败事件发送
		 */
		System.out.println("我是监听事件！在应用初始化时就发送事件！");
	}

}
