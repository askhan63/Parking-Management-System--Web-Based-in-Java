package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.entity.VehicleInfo;
@Repository
public interface VehicleRepo extends JpaRepository<VehicleInfo, Integer>{

}
