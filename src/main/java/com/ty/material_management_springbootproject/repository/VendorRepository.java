package com.ty.material_management_springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.material_management_springbootproject.dto.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
