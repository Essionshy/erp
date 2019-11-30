package com.tingyu.erp.util;

/**
 * 响应结果工具类，使ResultMessage可以链式注入值
 * 
 * @author William
 *
 */
public class ResultUtils {

	/**
	 * #响应成功 * 
	 * 
	 * @return
	 */
	public static ResultMessage success() {
		ResultMessage resultMessage = new ResultMessage();
		resultMessage.setType(ResultMessage.RESULT_TYPE_SUCCESS);
		resultMessage.setMessage("请求成功！");
		return resultMessage;

	}

	/**
	 * #响应失败
	 * @return
	 */
	public static ResultMessage fail() {
		ResultMessage resultMessage = new ResultMessage();
		resultMessage.setType(ResultMessage.RESULT_TYPE_SUCCESS);
		resultMessage.setMessage("请求失败！");
		return resultMessage;

	}

}
