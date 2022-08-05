package com.pms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "userInfo")
public class UserInfo{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userFirstName;
	private String userLastName;
	private String userGender;
	private String userAddress;
	private String phoneNumber;
	private String userEmail;
	private int noOfVehicles;
	private int userPostalCode;
	private String userCity;
	private String userName;
	private String userPassword;
	public UserInfo(String userFirstName, String userLastName, String userGender, String userAddress,
			String phoneNumber, String userEmail, int noOfVehicles, int userPostalCode, String userCity,
			String userName, String userPassword) {
		super();
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userGender = userGender;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
		this.userEmail = userEmail;
		this.noOfVehicles = noOfVehicles;
		this.userPostalCode = userPostalCode;
		this.userCity = userCity;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int a) {
		 this.id=a;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getNoOfVehicles() {
		return noOfVehicles;
	}
	public void setNoOfVehicles(int noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}
	public int getUserPostalCode() {
		return userPostalCode;
	}
	public void setUserPostalCode(int userPostalCode) {
		this.userPostalCode = userPostalCode;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}