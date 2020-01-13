package com.retial.charge.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.retial.entity.Retial;
import com.retial.util.BaseDao;

@Repository
public class RetialDao extends BaseDao<Retial>{
	
	
	public Retial getById(int id) {//根据id查找
		return (Retial)this.getById(id);
	}
	
	public List<Retial> findAll(int page,int total){//根据页数查找
		return this.page("from Retial",page,total);
	}
}
