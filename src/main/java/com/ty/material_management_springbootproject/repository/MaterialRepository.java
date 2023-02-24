package com.ty.material_management_springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.material_management_springbootproject.dto.Material;

public interface MaterialRepository extends JpaRepository<Material, Integer> {

}
