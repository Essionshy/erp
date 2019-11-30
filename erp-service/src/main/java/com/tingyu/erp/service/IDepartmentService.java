package com.tingyu.erp.service;

import java.util.List;

import com.tingyu.erp.entities.Department;

/**
 * 部门服务层接口
 * 
 * @author William
 * @create 2019-8-7
 *
 */
public interface IDepartmentService {
	/**
	 * #获取所有部门信息
	 * 
	 * @return
	 */
	List<Department> listDepts()throws Exception;

	Department getDept(String deptId) throws Exception;

	void insertDept(Department dept)throws Exception;

	void deleteDeptByDeptId(String deptId)throws Exception;

	void updateDeptByDeptId(Department dept)throws Exception;
	
	//List<Department> listDeptsCriteria
}