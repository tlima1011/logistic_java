package com.logistic_java.app;

import com.logistic_java.entities.ClienteFisica;
import com.logistic_java.entities.ClienteJuridica;
import com.logistic_java.entities.Order;
import com.logistic_java.entities.Product;
import com.logistic_java.entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		
		ClienteFisica clifisica = new ClienteFisica("José","252555333-2","258.822.333-88"); 
		ClienteJuridica cliejuridica = new ClienteJuridica("Chule Ltda e cia","2229898/0001-8","299.777.111-22");
		System.out.println();
		
		Product product1 = new Product("Notebook Alieware", 1, 5000, clifisica); 
		Product product2 = new Product("Desktop Optiplex Dell i9",3,6500,cliejuridica); 
		System.out.println(product1);
		System.out.println(product2);
		
		Order order = new Order (OrderStatus.PendingPayment, product1);
		System.out.println(order);
		
		String txt = OrderStatus.Processing.toString();
		System.out.println(txt);
		
		OrderStatus os = OrderStatus.valueOf("Delivered");
		System.out.println(os);
		
	}
}
