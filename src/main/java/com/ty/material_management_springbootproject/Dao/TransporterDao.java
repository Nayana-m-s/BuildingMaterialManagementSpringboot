package com.ty.material_management_springbootproject.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.material_management_springbootproject.dto.Transporter;

import com.ty.material_management_springbootproject.repository.TransporterRepository;

@Repository
public class TransporterDao {


	@Autowired
	private TransporterRepository repository;

	public Transporter saveTransporter(Transporter transporter) {
	return repository.save(transporter);

	}

	public Transporter UpdateTransporter(int id,Transporter transporter) {
	if (repository.findById(id).isPresent()) {
		transporter.setId(id);
	return repository.save(transporter);
	} else {
	return null;
	}

	}

	public Transporter deleteTransporter(int id) {
	if (repository.findById(id).isPresent()) {
		Transporter transporter = repository.findById(id).get();
	repository.delete(transporter);
	return transporter;
	} else {
	return null;
	}
	}

	public Transporter getTransporterById(int id) {
	if (repository.findById(id).isPresent()) {
	return repository.findById(id).get();
	} else {
	return null;
	}
	}

	 
	
}
