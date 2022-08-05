package com.pms.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "vehicleinfo")
public class VehicleInfo {

	 
	public VehicleInfo(String parkingNumber, String vehicleCategory, String vehicleCompanyname,
			String registrationNumber, String ownerName,  String inTime, String outTime,
			Double parkingCharge, String remark, String vehicleStatus) {
		super();
		ParkingNumber = parkingNumber;
		VehicleCategory = vehicleCategory;
		VehicleCompanyname = vehicleCompanyname;
		RegistrationNumber = registrationNumber;
		OwnerName = ownerName;
		
		InTime = inTime;
		OutTime = outTime;
		ParkingCharge = parkingCharge;
		Remark = remark;
		this.vehicleStatus = vehicleStatus;
	}
	public VehicleInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int vId;
	String   ParkingNumber ;
	 String  VehicleCategory;
	 String VehicleCompanyname;
	 String RegistrationNumber;
	 String  OwnerName;
	
	 String InTime;
	 String OutTime;
	 Double ParkingCharge;
	 String Remark;
	 String  vehicleStatus;
	 public void setVid(int id) {
		 vId=id;
	 }
	 public int getVid() {
		 return vId;
	 }
	public String getParkingNumber() {
		return ParkingNumber;
	}
	public void setParkingNumber(String parkingNumber) {
		ParkingNumber = parkingNumber;
	}
	public String getVehicleCategory() {
		return VehicleCategory;
	}
	public void setVehicleCategory(String vehicleCategory) {
		VehicleCategory = vehicleCategory;
	}
	public String getVehicleCompanyname() {
		return VehicleCompanyname;
	}
	public void setVehicleCompanyname(String vehicleCompanyname) {
		VehicleCompanyname = vehicleCompanyname;
	}
	public String getRegistrationNumber() {
		return RegistrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		RegistrationNumber = registrationNumber;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	
	public String getInTime() {
		return InTime;
	}
	public void setInTime(String inTime) {
		InTime = inTime;
	}
	public String getOutTime() {
		return OutTime;
	}
	public void setOutTime(String outTime) {
		OutTime = outTime;
	}
	public Double getParkingCharge() {
		return ParkingCharge;
	}
	public void setParkingCharge(Double parkingCharge) {
		ParkingCharge = parkingCharge;
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public String getVehicleStatus() {
		return vehicleStatus;
	}
	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}
	@Override
	public String toString() {
		return "VehicleInfo [ParkingNumber=" + ParkingNumber + ", VehicleCategory=" + VehicleCategory
				+ ", VehicleCompanyname=" + VehicleCompanyname + ", RegistrationNumber=" + RegistrationNumber
				+ ", OwnerName=" + OwnerName  + ", InTime=" + InTime
				+ ", OutTime=" + OutTime + ", ParkingCharge=" + ParkingCharge + ", Remark=" + Remark
				+ ", vehicleStatus=" + vehicleStatus + "]";
	}
	 
	
}
