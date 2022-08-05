package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.entity.AdminInfo;

@Repository
public interface AdminRepository extends JpaRepository<AdminInfo, Integer>{
	

}
