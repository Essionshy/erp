package com.tingyu.erp.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.tingyu.erp.entities.Department;
import com.tingyu.erp.entities.DepartmentExample;



public interface DepartmentMapper {
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Long id);   
    
    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);
    
    List<Department> selectAll();    
    
    Department selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
    
    int updateByDeptId(Department record);
}