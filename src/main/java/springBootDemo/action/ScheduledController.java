package springBootDemo.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时应用 
 * 
 * @version 1.0
 * @since JDK1.7
 * @author fuhw
 * @date 2016年6月17日 下午2:43:11
 */
@Component
public class ScheduledController {

	private static final SimpleDateFormat DATA_FORMAT = new SimpleDateFormat("HH:mm:ss");
	/**
	 * fixedRate(fixedRate = 5000) 以多长时间的频率执行
	 * cron(5/3 * * * * ? ) 以cron表达式执行
	 * fixedDeley 延迟多长时间执行
	 */
	@Scheduled(cron = "5/3 * * * * ? ")
	public void outputCurrentTime() {
		System.err.println("The current time is : " + DATA_FORMAT.format(new Date()));
	}
}
