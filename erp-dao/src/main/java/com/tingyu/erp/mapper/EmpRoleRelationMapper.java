package com.tingyu.erp.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.tingyu.erp.entities.EmpRoleRelation;
import com.tingyu.erp.entities.EmpRoleRelationExample;

public interface EmpRoleRelationMapper {
    long countByExample(EmpRoleRelationExample example);

    int deleteByExample(EmpRoleRelationExample example);

    int insert(EmpRoleRelation record);

    int insertSelective(EmpRoleRelation record);

    List<EmpRoleRelation> selectByExample(EmpRoleRelationExample example);

    int updateByExampleSelective(@Param("record") EmpRoleRelation record, @Param("example") EmpRoleRelationExample example);

    int updateByExample(@Param("record") EmpRoleRelation record, @Param("example") EmpRoleRelationExample example);
}