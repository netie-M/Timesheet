package com.qf.timesheet.dao.batis;

import org.springframework.stereotype.Repository;

import com.qf.timesheet.entity.UserArch;

@Repository(value="userArchBatisDAO")
public interface UserArchDAO{
	
	UserArch findByUserId(String userId);
	
}
