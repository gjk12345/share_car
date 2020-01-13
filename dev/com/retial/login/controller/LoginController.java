package com.retial.login.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retial.login.service.LoginService;

import net.sf.json.JSONObject;


@Controller
public class LoginController {

	@Resource
	private LoginService loginservice;
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public String login(@RequestBody JSONObject json) {
		int id = json.getInt("adminid");
		String password=json.getString("password");
		boolean b=loginservice.check(id, password);
		
		if(b) {
			String success="{\"status\":0,\"message\":\"login success\"}";
			return success;
		}
		else
		{
			String fail="{\"status\":1,\"message\":\" login failed\"}";
			return fail;
		}
	}
}
