package com.qf.timesheet.service;

import java.util.List;

import com.qf.timesheet.entity.UserArch;

public interface UserArchService {
	
	/**
	 * 查询单一用户
	 * @param userId
	 * @return
	 */
	UserArch queryUserArch(String userId);	
	
	/**
	 * 查询所有在职员工
	 * @return
	 */
	List<UserArch> queryAllUserArch();
	
	/**
	 * 员工离职
	 * @param id
	 */
	void dimission(Long id);
}
