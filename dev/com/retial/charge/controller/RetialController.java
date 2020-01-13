package com.retial.charge.controller;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.google.gson.JsonObject;
import com.retial.charge.service.RetialService;
import com.retial.entity.Retial;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

@Controller
public class RetialController {
	@Resource
	private RetialService retialservice;
	@RequestMapping(value="/addRetial")
	@ResponseBody
	public String addRetial(@RequestBody JSONObject json){
		return " ";
	}
	@RequestMapping(value="/delRetial")
	@ResponseBody
	public String delRetial(@RequestBody JSONObject json){
		return " ";
	}
	@RequestMapping(value="/getAllRetial")
	@ResponseBody
	public String getAllRetial(@RequestBody JSONObject json){
		int pagenum=json.getInt("pagenum");
		List<Retial> list=retialservice.getAllRetial(pagenum);
		if(list!=null) {
			JsonObject s;
			String success=com.alibaba.fastjson.JSON.toJSONString(list);
			return success;
		}
		else {
			return "{\"status\":1,\"message\":\" getAllRetial failed\"}";
		}
	}
	@RequestMapping(value="/getRetialById")
	@ResponseBody
	public String getRetialById(@RequestBody JSONObject json){
		int id=json.getInt("id");
		Retial r=retialservice.getRetialById(id);
		
		if(r!=null) {
			JSONObject j=new JSONObject();
			String response=j.fromObject(r).toString();
			return response;
		}
		else
		{
			return "{\"status\":1,\"message\":\" getRetialById failed\"}";
		}
	}
	@RequestMapping(value="/changeRetialSize")
	@ResponseBody
	public String changeRetialSize(@RequestBody JSONObject json){
		return " ";
	}
	@RequestMapping(value="/changeRetialAdmin")
	@ResponseBody
	public String changeRetialAdmin(@RequestBody JSONObject json){
		return " ";
	}
}
