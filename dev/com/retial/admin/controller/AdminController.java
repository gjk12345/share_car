package com.retial.admin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;
import com.retial.admin.service.AdminService;
import com.retial.entity.Admines;

import net.sf.json.JSONObject;

@Controller
public class AdminController {
	@Resource
	private AdminService adminservice;
	
	@RequestMapping(value="/addAdmin")
	@ResponseBody
	public String addAdmin(@RequestBody JSONObject json) {
		return " ";
	}
	@RequestMapping(value="/delAdmin")
	@ResponseBody
	public String delAdmin(@RequestBody JSONObject json) {
		return " ";
	}
	@RequestMapping(value="/changeAdminRole")
	@ResponseBody
	public String changeAdminRole(@RequestBody JSONObject json) {
		return " ";
	}
	@RequestMapping(value="/findAllAdmin")
	@ResponseBody
	public String findAllAdmin(@RequestBody JSONObject json) {
		int pagenum=json.getInt("pagenum");
		List<Admines> list=adminservice.getAllAdmin(pagenum);
		if(list!=null) {
			JsonObject s;
			String success=com.alibaba.fastjson.JSON.toJSONString(list);
			return success;
		}
		else {
			return "{\"status\":1,\"message\":\" findAllAdmin failed\"}";
		}
	}
	@RequestMapping(value="/findAdminById")
	@ResponseBody
	public String findAdminById(@RequestBody JSONObject json) {
		int id=json.getInt("id");
		Admines a=adminservice.getAdminById(id);
		if(a!=null) {
			JSONObject j=new JSONObject();
			String response=j.fromObject(a).toString();
			return response;
		}
		else {
			return "{\"status\":1,\"message\":\" findAdminById failed\"}";
		}
	}
}
