package com.tingyu.erp.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.tingyu.erp.entities.Employee;
import com.tingyu.erp.entities.EmployeeExample;



public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Long id);
    
    int deleteEmpByEmpId(String empId);
    
    int deleteByEmpIds(List<String> empIds);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);
    
    List<Employee> selectAllWithDept();

    Employee selectByPrimaryKey(Long id);
    
    Employee selectByEmpIdWithDept(String empId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}