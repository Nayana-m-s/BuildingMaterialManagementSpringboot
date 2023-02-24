package com.ty.material_management_springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.material_management_springbootproject.dto.MaterialOrder;

public interface OrderRepository extends JpaRepository<MaterialOrder, Integer> {

}
