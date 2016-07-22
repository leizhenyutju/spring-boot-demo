package springBootDemo.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import springBootDemo.entity.User;

public abstract class BaseEntity implements Serializable {

	/**
	 * 存放一些通用的属性值
	 */
	private static final long serialVersionUID = 1L;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**@JsonIgnore 忽略序列化*/
	@JsonIgnore
	public static final Integer SHOW = 1;
	@JsonIgnore
	public static final Integer HIDE = 0;
	
    private Date createDate;
    
    private User createBy;
    
    private Date updateDate;
    
    private User updateBy;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public User getCreateBy() {
		return createBy;
	}

	public void setCreateBy(User createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public User getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(User updateBy) {
		this.updateBy = updateBy;
	}
    
    
}