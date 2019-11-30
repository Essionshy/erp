package com.tingyu.erp.util;

import java.util.HashMap;
import java.util.Map;

	/**
	 * #封装json通用响应消息
	 * @author William
	 *
	 */
public class ResponseMessage {
		private static final Integer SUCCESS_CODE=200;
		private static final Integer FAILURE_CODE=100;
		private Integer stateCode;//响应状态码	100-失败，200-成功

		private String message;//响应消息
		
		private Map<String ,Object> data=new HashMap<String,Object>(); 
		
		public static ResponseMessage getSuccessMessage(String method) {
			ResponseMessage msg=new ResponseMessage();
			msg.setStateCode(SUCCESS_CODE);
			if("insert".equals(method)) {
				msg.setMessage("添加成功！！！");
			}else if("delete".equals(method)){
				msg.setMessage("删除成功！！！");
			}else if ("update".equals(method)){
					msg.setMessage("更新成功！！！");
			}else {
				msg.setMessage("请求成功");
			}		
			
			return msg;
		}
		public static ResponseMessage getFailureMessage(String method) {
			ResponseMessage msg=new ResponseMessage();
			msg.setStateCode(FAILURE_CODE);
			if("insert".equals(method)) {
				msg.setMessage("添加失败！！！");
			}else if("delete".equals(method)){
				msg.setMessage("删除失败！！！");
			}else if ("update".equals(method)){
					msg.setMessage("更新失败！！！");
			}else {
				msg.setMessage("请求失败");
			}		
			return msg;
		}
		public  ResponseMessage add(String key,Object value) {		
			 this.data.put(key,value);		 
			 return this;		
		}
		public Integer getStateCode() {
			return stateCode;
		}
		public void setStateCode(Integer stateCode) {
			this.stateCode = stateCode;
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

