package com.tingyu.erp.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.tingyu.erp.entities.Role;
import com.tingyu.erp.entities.RoleExample;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);
    
    List<Role> selectAll();

    Role selectByPrimaryKey(Byte id);
    
    Role selectByRoleId(String roleId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}