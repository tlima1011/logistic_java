package com.logistic_java.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.logistic_java.entities.enums.OrderStatus;

public class Order {
	
	private int ID; 
	private LocalDateTime Moment; 
	private OrderStatus Status;
	
	public Order(OrderStatus status) {
		ID = 1008; 
		Moment = LocalDateTime.now(); 
		this.Status = status; 
	}
	
	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
		String dataFormatada = Moment.format(fmt); 
		
		return ID
			    + ", "
			    + dataFormatada
			    + ", "
			    + Status; 
	} 
}
