package com.tingyu.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tingyu.erp.entities.Role;
import com.tingyu.erp.service.IRoleService;
import com.tingyu.erp.util.ResponseMessage;
import com.tingyu.erp.util.ResultMessage;
import com.tingyu.erp.util.ResultUtils;

/**
 * 角色控制器类
 * 
 * @author William
 *
 */
@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private IRoleService roleService;

	/**
	 * 根据角色编号查询角色信息
	 * 
	 * @param roleId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseMessage getRole(@PathVariable("id") String roleId) throws Exception {

		Role role = roleService.getRole(roleId);
		return ResponseMessage.getSuccessMessage("get").add("roles", role);
	}

	/**
	 * #查询所有角色信息
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseMessage getRoles() throws Exception {

		List<Role> roles = roleService.listRoles();
		return ResponseMessage.getSuccessMessage("get").add("roles", roles);
	}

	/**
	 * #添加角色
	 * 
	 * @param role
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultMessage addRole(Role role) throws Exception {

		ResultMessage rm = ResultUtils.success();
		roleService.insertRole(role);
		return rm;

	}

	/**
	 * #根据角色编号修改角色信息
	 * 
	 * @param role
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "roleId", method = RequestMethod.PUT)
	public ResultMessage updateRole(Role role) throws Exception {
		ResultMessage rm = ResultUtils.success();
		roleService.updateRole(role);
		return rm;
	}

	public ResultMessage deleteRole(@PathVariable("roleId") String roleId) throws Exception {
		ResultMessage rm = ResultUtils.success();
		 roleService.deleteRole(roleId);
		return rm;
	}
}
