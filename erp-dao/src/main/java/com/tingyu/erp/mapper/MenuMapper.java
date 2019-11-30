package com.tingyu.erp.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.tingyu.erp.entities.Menu;
import com.tingyu.erp.entities.MenuExample;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);
}