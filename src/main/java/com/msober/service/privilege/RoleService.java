package com.msober.service.privilege;

import java.util.List;

import com.msober.domain.common.PageBean;
import com.msober.domain.privilege.Role;
import com.msober.service.base.BaseService;
import com.msober.utils.QueryHelper;


public interface RoleService extends BaseService{

	/**
	 * 查询所有的岗位信息
	 * 
	 * @return
	 */
	List<Role> getAll();

	/**
	 * 删除岗位信息
	 * @param id
	 */
	void delete(Long id);

	/**
	 * 保存
	 * @param role
	 */
	void save(Role role);

	/**
	 * 获取
	 * @param id
	 * @return
	 */
	Role getById(Long id);

	/**
	 * 更新
	 * @param role
	 */
	void update(Role role);

	List<Role> getByIds(Long[] roleIds);

	PageBean getPageBean(int pageNum, QueryHelper helper);

}
