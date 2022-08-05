package com.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pms.entity.AdminInfo;
import com.pms.entity.UserInfo;
import com.pms.entity.VehicleInfo;
import com.pms.repository.AdminRepository;
import com.pms.repository.UserInfoRepo;
import com.pms.repository.VehicleRepo;

@Service
public class UserServices {
	@Autowired
private  UserInfoRepo up;
	@Autowired
private  AdminRepository  ad;
	@Autowired
	private VehicleRepo  vr;
public void addUser(UserInfo u) {
	up.save(u);
}
public List<UserInfo> getAllUser(){
return	up.findAll();
}
public void addAdmin(AdminInfo a) {
	ad.save(a);
}
public void addVehicle(VehicleInfo a) {
	vr.save(a);
}


}
