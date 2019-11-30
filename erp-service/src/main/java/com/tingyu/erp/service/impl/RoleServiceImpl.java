package com.tingyu.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tingyu.erp.entities.Role;
import com.tingyu.erp.mapper.RoleMapper;
import com.tingyu.erp.service.IRoleService;
/**
 * Role 增删改查的实现类
 * @author William
 *
 */

@Service
public class RoleServiceImpl implements IRoleService {

	@Autowired
	private RoleMapper roleMapper;
	/**
	 * Query Role
	 */
	@Override
	public Role getRole(String roleId) throws Exception{
		return roleMapper.selectByRoleId(roleId);
	}
	/**
	 * Query all roles
	 */
	@Override
	public List<Role> listRoles() {
		return roleMapper.selectAll();
	}
	/**
	 * Add role
	 * @param 角色对象
	 */
	@Override
	public void insertRole(Role role) {
		 roleMapper.insert(role);
	}
	/**
	 * Delete Role
	 */
	@Override
	public void deleteRole(String roleId) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Update Role
	 */
	@Override
	public void updateRole(Role role) {
		 roleMapper.updateByPrimaryKey(role);
	}
	

}
