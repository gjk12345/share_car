package com.retial.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.retial.entity.Admines;
import com.retial.login.dao.LoginDao;

@Service
public class LoginService {
	@Resource
	private LoginDao logindao;
	public boolean check(int id,String password) {
		Admines a=this.logindao.getAdminByID(id);
		if(a==null)return false;
		if(a.getPassword()==password)
			return true;
		else
			return false;
	}
}
