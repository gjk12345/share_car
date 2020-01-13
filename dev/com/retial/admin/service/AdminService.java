package com.retial.admin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.retial.admin.dao.AdminDao;
import com.retial.entity.Admines;

@Service
public class AdminService {
	@Resource
	private AdminDao Admindao;
	public Admines getAdminById(int id) {
		return Admindao.getbyid(id);
	}
	public List<Admines> getAllAdmin(int page){
		int total=20;
		return Admindao.findAll(page, total);
	}
}
