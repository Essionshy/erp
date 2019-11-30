package com.tingyu.erp.service;

import java.util.List;

import com.tingyu.erp.entities.Employee;

/**
 * 员工服务层接口
 * @author William
 *
 */
 public interface IEmployeeService {
	/**
	 * 查询所有员工信息
	 * @return
	 * @throws Exception 
	 */
	 List<Employee> listAllEmps()throws Exception;
	/**
	 * 根据员工编号 查询 员工信息
	 * @param id
	 * @return
	 */
	 Employee getEmpByEmpIdWithDept(String empId)throws Exception;
	/**
	 * 新增员工信息
	 * @param employee
	 * @return
	 * @throws Exception 
	 */
	 void saveEmp(Employee employee) throws Exception;
	/**
	 * 根据员工编号删除员工信息
	 * @param id
	 * @return
	 */
	 void deleteEmpByEmpId(String  empId)throws Exception;
	/**
	 * 更新员工信息
	 * @param employee
	 * @return
	 */
	 void updateEmp(Employee employee)throws Exception;
	/**
	 * 批量删除员工信息
	 * @param ids
	 * @return
	 */
	 void deleteEmpsByBatch(List<String> empIds)throws Exception;
	
}
