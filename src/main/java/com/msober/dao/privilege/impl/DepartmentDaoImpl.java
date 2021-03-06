package com.msober.dao.privilege.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.msober.dao.common.impl.BaseDaoImpl;
import com.msober.dao.privilege.DepartmentDao;
import com.msober.domain.privilege.Department;

@Repository
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{

	public List<Department> findChildren(Long parentId) {
		return getSession().createQuery(//
				"FROM Department d WHERE d.parent.id=?")//
				.setParameter(0, parentId)//
				.list();
	}

	public List<Department> findTopList() {
		return getSession().createQuery(//
				"FROM Department d WHERE d.parent IS NULL")//
				.list();
	}

}
