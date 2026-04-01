package com.logistic_java.app;

import com.logistic_java.entities.Order;
import com.logistic_java.entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		
		Order order = new Order (OrderStatus.PendingPayment);
		System.out.println(order);
		
		String txt = OrderStatus.Processing.toString();
		System.out.println(txt);
		
		 OrderStatus os = OrderStatus.valueOf("Delivered");
		 System.out.println(os);
		
	}
}
