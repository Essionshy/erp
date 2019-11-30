package com.tingyu.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tingyu.erp.entities.Employee;
import com.tingyu.erp.exception.ResultException;
import com.tingyu.erp.mapper.EmployeeMapper;
import com.tingyu.erp.service.IEmployeeService;
import com.tingyu.erp.util.ResultMessage;
/**
 * #员工服务层实现类
 * @author William
 *
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeMapper empMapper;
	/**
	 * 查询所有员工信息
	 */
	@Override
	public List<Employee> listAllEmps()throws Exception{
		return empMapper.selectAllWithDept();
	}

	@Override
	public Employee getEmpByEmpIdWithDept(String empId)throws Exception {
		return empMapper.selectByEmpIdWithDept(empId);
	}

	/**
	 * 新增员工信息
	 */
	@Override
	public void saveEmp(Employee employee)throws Exception {
		Employee emp=getEmpByEmpIdWithDept(employee.getEmpId());
		if(emp != null) {
			//员工已存在，请不要重复添加
			ResultMessage rm=new ResultMessage();
			rm.setType(ResultMessage.RESULT_TYPE_FAIL);
			rm.setMessage("该员工已存在，请不要重复添加！！");
			throw new ResultException(rm);
		}
		empMapper.insert(employee);
	}

	@Override 
	public void deleteEmpByEmpId(String  empId) throws Exception {
		//判断员工是否存在
		Employee emp=getEmpByEmpIdWithDept(empId);
		if(emp == null) {
			//员工不存在
			ResultMessage rm=new ResultMessage();
			rm.setType(ResultMessage.RESULT_TYPE_FAIL);
			rm.setMessage("该员工不存在！！");
			throw new ResultException(rm);
		}
		//员工存在执行删除操作
		 empMapper.deleteEmpByEmpId(empId);
	}

	@Override
	public void updateEmp(Employee employee) throws Exception {
		Employee emp=getEmpByEmpIdWithDept(employee.getEmpId());
		if(emp == null) {
			//员工不存在
			ResultMessage rm=new ResultMessage();
			rm.setType(ResultMessage.RESULT_TYPE_FAIL);
			rm.setMessage("该员工不存在！！");
			throw new ResultException(rm);
		}
		 empMapper.updateByPrimaryKey(employee);
	}

	@Override
	public void deleteEmpsByBatch(List<String> empIds) {
		
		
		
		 empMapper.deleteByEmpIds(empIds);
	}
}