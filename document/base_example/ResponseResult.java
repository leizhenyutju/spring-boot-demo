package base_example;

import java.util.List;
import java.util.Map;

import org.springframework.validation.FieldError;

import com.google.common.collect.Maps;

public class ResponseResult {
    
	private Object data;

	private Boolean success;

	private String msg;
	
	public static ResponseResult getInstance() {
		return new ResponseResult();
	}

	private Map<String, String> errors = Maps.newHashMap();
	
	public ResponseResult (){}
	
	public ResponseResult (boolean success){
	    this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ResponseResult convertData(Object data) {
		this.data = data;
		this.success = data != null;
		return this;
	}

	public ResponseResult convertErrors(List<FieldError> errors) {
		for (FieldError fieldError : errors) {
			this.errors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		this.success = false;
		this.msg = "参数错误！";
		return this;
	}

	public ResponseResult convertException(Exception e) {
		success = false;
		e.printStackTrace();
		if (e instanceof SystemException) {
			msg = e.getMessage();
		} else {
			msg = "系统发生了意外错误。";
		}
		return this;
	}
    

}
