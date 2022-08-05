package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.entity.UserInfo;
@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo, Integer>{

}
