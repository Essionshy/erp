package com.tingyu.erp.service;

import java.util.List;

import com.tingyu.erp.entities.Role;

/**
 * #角色服务层接口
 * @author William
 *
 */
 public interface IRoleService {
	 /**
	  *  	添加角色 
	  * @param role
	  * @return
	  */
	 void insertRole(Role role)throws Exception;
	 /**
	  * 	根据角色id删除角色 
	  * @param roleId
	  * @return
	  */
	 void deleteRole(String roleId)throws Exception;
	 /**
	  * 	更新角色 
	  * @param role
	  * @return
	  */
	 void updateRole(Role role)throws Exception;
	 /**
	  * 	根据角色id查询角色信息
	  * @param roleId
	  * @return
	 * @throws Exception 
	  */
	 Role getRole(String roleId) throws Exception;
	 /**
	  * 	查询所有角色信息
	  * @return
	  */
	 List<Role> listRoles()throws Exception;
}
