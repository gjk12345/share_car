package com.retial.login.dao;

import org.springframework.stereotype.Repository;

import com.retial.entity.Admines;
import com.retial.util.BaseDao;



@Repository
public class LoginDao extends BaseDao<Admines>{
	public Admines getAdminByID (int id) {
		Admines a=(Admines)this.getById(Admines.class, id);
		return a;
	}
}
