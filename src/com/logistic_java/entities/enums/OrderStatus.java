package com.logistic_java.entities.enums;

public enum OrderStatus {

	PendingPayment(0), 
	Processing(1), 
	Shipped(2), 
	Delivered(3);  
	
	private int code; 
	
	private OrderStatus(int c) {
		this.code = c; 
	}
	
	public int getCode() {
		return code; 
	}
}
