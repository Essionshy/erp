package com.tingyu.erp.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回Restful风格的JSON消息
 * @author William
 *
 */
@SuppressWarnings("unused")
public class ResultMessage {
	
	
	public static final int RESULT_TYPE_FAIL=0;//失败
	public static final int RESULT_TYPE_SUCCESS=1;//成功
	public static final int RESULT_TYPE_WARN=2;//警告
	public static final int RESULT_TYPE_INFO=3;//提示
	
	public ResultMessage() {
		super();
	}
	
	public ResultMessage(int type, String message) {
		super();
		this.type = type;
		this.message = message;
	}
	
	public ResultMessage(int type, int errorCode, String message) {
		super();
		this.type = type;
		this.errorCode = errorCode;
		this.message = message;
	}

	public ResultMessage(int type, int errorCode, String message, Map<String, Object> data) {
		super();
		this.type = type;
		this.errorCode = errorCode;
		this.message = message;
		this.data = data;
	}

	/**
	 * 消息提示类型：成功，失败，警告，提示
	 */
	private int type;//返回状态码 
	/**
	 * 返回异常错误代码
	 */
	private int errorCode;
	
	/**
	 * 返回提示信息
	 */
	private String message;
	/**
	 * 返回查询结果
	 */
	private Map<String,Object> data;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}	
}
