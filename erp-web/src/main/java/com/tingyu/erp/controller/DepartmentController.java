package com.tingyu.erp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tingyu.erp.entities.Department;
import com.tingyu.erp.service.IDepartmentService;
import com.tingyu.erp.util.DataGridResult;
import com.tingyu.erp.util.ResponseMessage;

/**
 * 部门控制器类
 * 
 * @author William
 *
 */
@RestController
@RequestMapping("/dept")
public class DepartmentController {
	private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	@Autowired
	private IDepartmentService deptService;

	/**
	 * 查询所有部门信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public DataGridResult listDepts() throws Exception {

		logger.debug("请求");
		List<Department> depts = deptService.listDepts();
		DataGridResult dataGridResult = new DataGridResult();
		dataGridResult.setTotal(depts.size());
		dataGridResult.setList(depts);
		return dataGridResult;
	}

	/**
	 * 条件查询部门信息
	 * 
	 * @param dept
	 * @return
	 */

	public ResponseMessage listDeptsByPage(Department dept) {

		return ResponseMessage.getSuccessMessage("get").add("pageInfo", null);
	}
}