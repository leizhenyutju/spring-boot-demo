package base_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public  abstract class BaseController<T extends BaseEntity> {

	protected Logger logger;

	private String moduleName;
	
	public BaseController() {
	}
	
	public BaseController(Class<?> clazz, String moduleName) {
		super();
		this.logger = LoggerFactory.getLogger(clazz);
		this.moduleName = moduleName;
	}
	
	protected void outLog(String methodName, Object... data) {
		logger.debug(moduleName + " >>>> " + methodName + " data ===> " + JsonMapper.getInstance().toJson(data));
//		log.create(new OperationLog(moduleName, methodName, JsonMapper.getInstance().toJson(data)));
	}
}
