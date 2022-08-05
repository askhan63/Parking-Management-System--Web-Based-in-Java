package com.pms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "adminInfo")
public class AdminInfo {
	

public AdminInfo(int adminId, String adminName, String username, String mobileNumber, String securityCode,
			String adminEmail, String adminPassword, String regDate) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.securityCode = securityCode;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
		this.regDate = regDate;
	}
public AdminInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int adminId;
private String adminName;
private String username;
private String mobileNumber;
private String securityCode;
private String adminEmail;
private String adminPassword;
private String regDate;

public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getSecurityCode() {
	return securityCode;
}
public void setSecurityCode(String securityCode) {
	this.securityCode = securityCode;
}
public String getAdminEmail() {
	return adminEmail;
}
public void setAdminEmail(String adminEmail) {
	this.adminEmail = adminEmail;
}
public String getAdminPassword() {
	return adminPassword;
}
public void setAdminPassword(String adminPassword) {
	this.adminPassword = adminPassword;
}
public String getRegDate() {
	return regDate;
}
public void setRegDate(String regDate) {
	this.regDate = regDate;
}
@Override
public String toString() {
	return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", username=" + username + ", mobileNumber="
			+ mobileNumber + ", securityCode=" + securityCode + ", adminEmail=" + adminEmail + ", adminPassword="
			+ adminPassword + ", regDate=" + regDate + "]";
}

}
