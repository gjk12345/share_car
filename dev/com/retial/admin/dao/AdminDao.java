package com.retial.admin.dao;

import java.util.List;

import org.logicalcobwebs.proxool.admin.Admin;
import org.springframework.stereotype.Repository;

import com.retial.entity.Admines;
import com.retial.util.BaseDao;

@Repository
public class AdminDao extends BaseDao<Admines>{
	public Admines getbyid(int id) {
		Admines a=(Admines)this.getById(Admin.class, id);
		return a;
	}
	public List<Admines> findAll(int page,int total){
		return this.page("from Admines", page,total);
	}
}
