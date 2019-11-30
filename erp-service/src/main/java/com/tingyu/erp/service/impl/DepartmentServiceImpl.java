package com.tingyu.erp.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tingyu.erp.entities.Department;
import com.tingyu.erp.entities.DepartmentExample;
import com.tingyu.erp.entities.DepartmentExample.Criteria;
import com.tingyu.erp.mapper.DepartmentMapper;
import com.tingyu.erp.service.IDepartmentService;
import com.tingyu.erp.util.ResultMessage;

/**
 * Department crud method implements
 * 
 * @author William Date 2019-8-8
 */
@Service
public class DepartmentServiceImpl implements IDepartmentService {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);
	@Autowired
	private DepartmentMapper deptMapper;

	/**
	 * @ all depts
	 */
	@Override
	public List<Department> listDepts() throws Exception {
		logger.debug("调用服务层方法listDepts()");
		return deptMapper.selectAll();
	}

	/**
	 * 查询单个部门信息 
	 * @param deptId @
	 */
	public Department getDept(String deptId) throws Exception {
		logger.debug("调用服务层方法 getDept(String deptId)");
		//条件查询 
		DepartmentExample example=new DepartmentExample();
		Criteria criteria= example.createCriteria();
		criteria.andDeptIdEqualTo(deptId);
		List<Department> depts= deptMapper.selectByExample(example);		
		if(depts !=null && depts.size() == 1) {
			return depts.get(0);
		}
		//部门不存在
		return null;
	}

	
	@Override
	public void insertDept(Department dept) throws Exception {
		//添加验证逻辑
		
		//验证部门信息是否已存在
		Department department=getDept(dept.getDeptId());
		if(department != null) {
			ResultMessage rm=new ResultMessage();
			rm.setType(ResultMessage.RESULT_TYPE_FAIL);
			rm.setMessage("该部门已存在");
		}
		
		deptMapper.insert(dept);
	}

	@Override
	public void deleteDeptByDeptId(String deptId) throws Exception {
		Department department=getDept(deptId);
		if(department == null) {
			ResultMessage rm=new ResultMessage();
			rm.setType(ResultMessage.RESULT_TYPE_FAIL);
			rm.setMessage("您要删除的部门不存在");
		}
		DepartmentExample example=new DepartmentExample();
		Criteria criteria=example.createCriteria();
		criteria.andDeptIdEqualTo(deptId);
		deptMapper.deleteByExample(example);
	}

	@Override
	public void updateDeptByDeptId(Department dept) throws Exception {
		Department department=getDept(dept.getDeptId());
		if(department == null) {
			ResultMessage rm=new ResultMessage();
			rm.setType(ResultMessage.RESULT_TYPE_FAIL);
			rm.setMessage("您要更新的部门不存在");
		}
		DepartmentExample example=new DepartmentExample();
		Criteria criteria=example.createCriteria();
		criteria.andDeptIdEqualTo(dept.getDeptId());		
		deptMapper.updateByExample(dept, example);
	}
}