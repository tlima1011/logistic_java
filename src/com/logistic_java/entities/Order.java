package com.logistic_java.entities;

import java.time.LocalDateTime;
import com.logistic_java.entities.enums.OrderStatus;

public class Order {
	
	private int ID; 
	private LocalDateTime Moment; 
	private OrderStatus Status;
	
	
	@Override
	public String toString() {
		return ID
			    + ", "
			    + Moment
			    + ", "
			    + Status; 
	} 
}
