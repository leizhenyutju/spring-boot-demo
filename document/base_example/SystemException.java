package base_example;

/**
 * 系统异常
 * 
 * Puxin technology（Shanghai）co., LTD product
 * 
 * @author YH 2015-6-5 上午10:43:53
 * @version 1.0
 */
public class SystemException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String code;
	public SystemException(String msg, String code) {
		super(msg);
		this.code = code;
	}
	public SystemException(String msg) {
	    super(msg);
	}
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
