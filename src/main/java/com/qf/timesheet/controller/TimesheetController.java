package com.qf.timesheet.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TimesheetController {
	@Value("${hello.message}")
	String helloMessage;

	@RequestMapping(method = RequestMethod.GET,value = "/application_info")
	public @ResponseBody String applicationInfo() {
		return helloMessage;
	}
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}
