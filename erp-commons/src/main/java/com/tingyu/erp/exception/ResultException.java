package com.tingyu.erp.exception;

import com.tingyu.erp.util.ResultMessage;

/**
 * 自定义响应异常类ResponseException
 * 
 * @author William
 *
 */
@SuppressWarnings("serial")
public class ResultException extends Exception {

	private ResultMessage resultMessage;

	public ResultException(ResultMessage resultMessage) {
		super(resultMessage.getMessage());
		this.resultMessage = resultMessage;
	}

	public ResultMessage getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(ResultMessage resultMessage) {
		this.resultMessage = resultMessage;
	}

}
