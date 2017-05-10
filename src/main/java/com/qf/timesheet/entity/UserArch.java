package com.qf.timesheet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "USER_ARCH")
public class UserArch {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
	@Column(name="USER_ID")
	private String userId;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="USER_STATUS")
	private String userStatus;
	
//	@Transient
	
	@Temporal(TemporalType.DATE)
	@Column(name="DIMISSION_DATE")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+08:00")
	//允许接收字符串作为日期
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dimissionDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public Date getDimissionDate() {
		return dimissionDate;
	}

	public void setDimissionDate(Date dimissionDate) {
		this.dimissionDate = dimissionDate;
	}
	
}
