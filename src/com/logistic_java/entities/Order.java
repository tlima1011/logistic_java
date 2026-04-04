package com.logistic_java.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.logistic_java.entities.enums.OrderStatus;

public class Order {
	
	private int ID; 
	private static int ultimoCodigo = 1; 
	private LocalDateTime Moment; 
	private OrderStatus Status;
	private Cliente cliente; 
	private Product product; 
	
	public Order(OrderStatus status) {
		ID = 1008; 
		Moment = LocalDateTime.now(); 
		this.Status = status; 
	}
	
	public Order(OrderStatus status, Cliente c, Product p) {
		this.ID = ultimoCodigo++; 
		this(status); 
		Moment = LocalDateTime.now();
		this.cliente = c; 
		this.product = p; 
	}
	
	
	public Order(OrderStatus status, Product p) {
		this(status); 
		this.product = p;
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
