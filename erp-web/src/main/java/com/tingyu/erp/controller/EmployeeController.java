package com.tingyu.erp.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tingyu.erp.entities.Employee;
import com.tingyu.erp.service.IEmployeeService;
import com.tingyu.erp.util.ResponseMessage;
import com.tingyu.erp.util.ResultMessage;
import com.tingyu.erp.util.ResultUtils;

/**
 * 员工控制器类
 * 
 * @author William
 *
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	private IEmployeeService empService;

	/**
	 * #分页查询员工信息，返回JSON数据
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseMessage listEmps(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "pageSize", defaultValue = "8") int pageSize) throws Exception {
		logger.info("ajax请求查询 员工信息");

		PageHelper.startPage(pageNum, pageSize);
		List<Employee> emps = empService.listAllEmps();
		@SuppressWarnings({ "unchecked", "rawtypes" })
		PageInfo pageInfo = new PageInfo(emps, 5);
		return ResponseMessage.getSuccessMessage("get").add("pageInfo", pageInfo);
	}

	/**
	 * #通过员工id获取单个员工信息
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseMessage getEmpById(@PathVariable("id") String empId) throws Exception {
		Employee emp = empService.getEmpByEmpIdWithDept(empId);

		return ResponseMessage.getSuccessMessage("get").add("emp", emp);
	}

	/**
	 * 添加用户信息
	 * 
	 * @param employee
	 * @return
	 */

	@PostMapping
	public ResultMessage saveEmp(Employee employee) throws Exception {
		// 默认返回操作成功消息
		ResultMessage resultMsg = ResultUtils.success();
		empService.saveEmp(employee);

		return resultMsg;

	}

	/**
	 * 更新员工信息
	 * 
	 * @param employee
	 * @return
	 */

	@RequestMapping(value = "/{empId}", method = RequestMethod.PUT)
	public ResultMessage updateEmp(Employee employee) throws Exception {
		System.out.println("修改请求" + employee);
		// 默认返回操作成功消息
		ResultMessage resultMsg = ResultUtils.success();

		empService.updateEmp(employee);

		return resultMsg;

	}

	/**
	 * 删除单个记录与批量删除二全一
	 * 
	 * @param id
	 * @return
	 */

	@RequestMapping(value = "/{ids}", method = RequestMethod.DELETE)
	public ResultMessage deleteEmp(@PathVariable("ids") String ids) throws Exception 
	{
		// 默认返回操作成功消息
		ResultMessage resultMsg = ResultUtils.success();
		if (ids.contains("-")) {
			// 批量删除记录
			List<String> list_id = new ArrayList<>();
			String[] str_ids = ids.split("-");
			for (String str : str_ids) {
				list_id.add(str);
			}
			empService.deleteEmpsByBatch(list_id);
		} else {
			// 删除单个记录
			@SuppressWarnings("unused")
			Long id = Long.valueOf(ids);
			empService.deleteEmpByEmpId(ids);
		}
		return resultMsg;
	}
}