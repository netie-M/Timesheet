package com.qf.timesheet.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimesheetController {
	@Value("${hello.message}")
	String helloMessage;

	@RequestMapping(value = "/")
	public String index() {
		return helloMessage;
	}
}
