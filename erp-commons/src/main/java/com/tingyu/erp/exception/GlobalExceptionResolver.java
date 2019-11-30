package com.tingyu.erp.exception;

import java.io.IOException;
import java.lang.reflect.Method;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.tingyu.erp.util.ResultMessage;

/**
 * 自定义全局异常处理器GlobalExceptionResolver
 * 
 * @author William
 *
 */
//@Component
public class GlobalExceptionResolver implements HandlerExceptionResolver {

	// 注入JSON转换器,将异常信息转换为json

	private HttpMessageConverter<ResultException> jsonMessageConverter;

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		// 1.输出异常堆栈信息
		ex.printStackTrace();
		// 2.获取springmvc底层对象，因为springmvc是面向方法开发的，因此只有一个方法
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		// 3.获取方法
		Method method = handlerMethod.getMethod();
		// 4.判断方法返回类型，String 还是 JSON对象，只要方法上带有@ResponseBody注解即为json
		ResponseBody responseBody = AnnotationUtils.findAnnotation(method, ResponseBody.class);
		if (responseBody != null) {
			// 表示返回json类型数据
			System.out.println("响应异常普通 ");
			ResultException resultException = resolverException(ex);
			HttpOutputMessage outputMessage = new ServletServerHttpResponse(response);
			try {
				jsonMessageConverter.write(resultException, MediaType.APPLICATION_JSON, outputMessage);
			} catch (HttpMessageNotWritableException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// 否则表示请求返回的是一个jsp页面

		// 异常信息解析方法
		ResultException resultException = resolverException(ex);
		// 将异常信息在异常页面显示

		System.out.println("响应页面跳转 " + resultException.getMessage());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("ExceptionInfo", resultException.getMessage());
		modelAndView.setViewName("Error");
		return modelAndView;
	}

	/**
	 * 异常解析
	 * 
	 * @param ex
	 * @return
	 */

	private ResultException resolverException(Exception ex) {

		ResultMessage resultMessage = null;
		// 1.判断异常类型是否是自定义异常
		if (ex instanceof ResultException) {
			System.out.println("**********判断是否ResultException为知异常************");
			resultMessage = ((ResultException) ex).getResultMessage();
		} else {
			System.out.println("**********判断是否为未知异常************");
			resultMessage = new ResultMessage();
			resultMessage.setType(ResultMessage.RESULT_TYPE_FAIL);
			resultMessage.setMessage("未知错误！！");
			System.out.println("**********判断是否为未知异常************" + resultMessage.getMessage());
		}

		return new ResultException(resultMessage);
	}

	public HttpMessageConverter<ResultException> getJsonMessageConverter() {
		return jsonMessageConverter;
	}

	public void setJsonMessageConverter(HttpMessageConverter<ResultException> jsonMessageConverter) {
		this.jsonMessageConverter = jsonMessageConverter;
	}
}
