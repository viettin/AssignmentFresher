package com.dxc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dxc.Dao.UserDao;


@Controller
public class UserController {
	@Autowired
	private UserDao userDao;
	
public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

@RequestMapping("login")
public String login (HttpServletRequest request) {
	String name = request.getParameter("username");
	String pass = request.getParameter("password");
	if(userDao.Checklogin(name, pass)) {
		
		return"success";
	}
return"fail";}
}
