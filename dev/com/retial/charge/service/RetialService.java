package com.retial.charge.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.retial.charge.dao.RetialDao;
import com.retial.entity.Retial;
@Service
public class RetialService {
	@Resource
	private RetialDao retialdao;
	public Retial getRetialById(int id) {
		Retial r=retialdao.getById(id);
		return r;
	}
	public List<Retial> getAllRetial(int page){
		int total = 20;
		List<Retial> list=retialdao.findAll(page, total);
		return list;
	}
}
