package com.qf.timesheet.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.qf.BaseTest;
/*
 * 问题: Table 'timesheet.user_arch' doesn't exist
 * 原因: mySQL 表明大小写敏感
 * 解决方案: 1. 重写方法  ImprovedNamingStrategy.classToTableName
 *        2. 设置mySQL表明大小写不敏感
 */
public class UserArchDAOTest extends BaseTest{

	@Autowired com.qf.timesheet.dao.batis.UserArchDAO userArchBatisDAO;
	
	@Autowired com.qf.timesheet.dao.jpa.UserArchDAO  userArchJpaDAO;

	@Test
	public void findByUserIdBatisTest() {
		Assert.notNull(userArchBatisDAO.findByUserId("2016120351"));
	}
	
	@Test
	public void findByUserIdJpaTest() {
		Assert.notNull(userArchJpaDAO.findByUserId("2016120351"));
	}

}
