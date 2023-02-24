package com.ty.material_management_springbootproject.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.material_management_springbootproject.dto.MaterialOrder;
import com.ty.material_management_springbootproject.repository.OrderRepository;

@Repository
public class MaterialOrderDao {

	@Autowired
	private OrderRepository repository;

	public MaterialOrder saveMaterialOrder(MaterialOrder materialOrder) {
	return repository.save(materialOrder);

	}

	public MaterialOrder UpdateMaterialOrder(int id,MaterialOrder materialOrder) {
	if (repository.findById(id).isPresent()) {
		materialOrder.setId(id);
	return repository.save(materialOrder);
	} else {
	return null;
	}

	}

	public MaterialOrder deleteMaterialOrder(int id) {
	if (repository.findById(id).isPresent()) {
		MaterialOrder materialOrder = repository.findById(id).get();
	repository.delete(materialOrder);
	return materialOrder;
	} else {
	return null;
	}
	}

	public MaterialOrder getMaterialOrderById(int id) {
	if (repository.findById(id).isPresent()) {
	return repository.findById(id).get();
	} else {
	return null;
	}
	}

	 
}
