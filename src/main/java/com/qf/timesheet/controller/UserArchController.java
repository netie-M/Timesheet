package com.qf.timesheet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qf.timesheet.entity.UserArch;
import com.qf.timesheet.service.UserArchService;

@RestController
public class UserArchController {
	@Autowired UserArchService userArchService;
	
	@RequestMapping(method = RequestMethod.GET,value = "/queryAllUserArch")
	public List<UserArch> queryAllUserArch(){
		return userArchService.queryAllUserArch();
	}
	@RequestMapping(method = RequestMethod.POST,value = "/saveUserArch")
	public UserArch saveAllUserArch(HttpServletRequest request, UserArch userArch1){
		
		System.out.println(userArch1.getUserId());
		System.out.println(userArch1.getUserName());
		System.out.println(userArch1.getUserStatus());
		System.out.println(userArch1.getDimissionDate());
		

		return userArch1;
	}
}
