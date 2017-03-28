package com.qf.timesheet.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.timesheet.dao.jpa.UserArchDAO;
import com.qf.timesheet.entity.UserArch;
import com.qf.timesheet.enums.UserStatusEnum;
import com.qf.timesheet.service.UserArchService;

@Service
public class UserArchServiceImpl implements UserArchService {
	@Autowired
	UserArchDAO userArchJpaDAO;

	public UserArch queryUserArch(String userId) {
		if (StringUtils.isBlank(userId)) {
			return null;
		} else {
			return userArchJpaDAO.findByUserId(userId);
		}
	}

	public List<UserArch> queryAllUserArch() {
		return userArchJpaDAO
				.findByUserStatus(UserStatusEnum.USERARCH_STATUS_INCUMBENCY
						.getStatus());
	}

	public void dimission(Long id) {
		// TODO Auto-generated method stub
		
	}

	
}
