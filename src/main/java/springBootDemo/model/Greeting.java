package springBootDemo.model;

/**
 * 创建一个实体
 * 
 * @version 1.0
 * @since JDK1.7
 * @author fuhw
 * @copyright (c) 2016 SunTime Co'Ltd Inc. All rights reserved.
 * @date 2016年6月17日 下午1:44:52
 */
public class Greeting {

	private  final long id;
	private final String content;
	
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
	
	
}
