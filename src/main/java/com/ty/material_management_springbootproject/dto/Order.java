package com.ty.material_management_springbootproject.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Order {
	     @Id
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
		private String name;
		private int quantity;
		private String dateof_purchase;
		private double price;
		private double total_amount;
		private String delivery_status;
		
		 @ManyToOne
		 	Customer customer;
		  @OneToOne
		 Transporter transporter ;

	
	

}
