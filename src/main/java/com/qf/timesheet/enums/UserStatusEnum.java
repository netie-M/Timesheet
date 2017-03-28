package com.qf.timesheet.enums;

public enum UserStatusEnum {
	USERARCH_STATUS_INCUMBENCY("1"),USERARCH_STATUS_DIMISSION("0");
	
	private String status;

	private UserStatusEnum(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	
	@Override
	public String toString() {
		return this.status;
	}
	
}
