package com.tingyu.erp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.tingyu.erp.entities.RoleMenuRelation;
import com.tingyu.erp.entities.RoleMenuRelationExample;

public interface RoleMenuRelationMapper {
    long countByExample(RoleMenuRelationExample example);

    int deleteByExample(RoleMenuRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoleMenuRelation record);

    int insertSelective(RoleMenuRelation record);

    List<RoleMenuRelation> selectByExample(RoleMenuRelationExample example);

    RoleMenuRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoleMenuRelation record, @Param("example") RoleMenuRelationExample example);

    int updateByExample(@Param("record") RoleMenuRelation record, @Param("example") RoleMenuRelationExample example);

    int updateByPrimaryKeySelective(RoleMenuRelation record);

    int updateByPrimaryKey(RoleMenuRelation record);
}