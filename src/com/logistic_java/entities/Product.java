package com.logistic_java.entities;

public class Product {
	
	private String number; 
	private int quantidade; 
	private double precoUnitario; 
	private Cliente cliente; 
	
	public Product(String n, int q, double pu, Cliente c) {
		this.number = n; 
		this.quantidade = q; 
		this.precoUnitario = pu; 
		this.cliente = c; 
	}
		
	public Product(String n, int q, double pu) { 
		this(n, q, pu, null); 
	}
	
	private double precoTotal() { 
		return this.precoUnitario * this.quantidade; 
	}

	@Override
	public String toString() {
		
		return String.format("Product"
				+ "Number: %s"
				+ "Quantidade: %d"
				+ "Preço Unitário: R$%.2f"
				+ "Preço Total: R$%.2f"
				+ "Cliente: " + cliente, 
				number, quantidade, precoUnitario, precoTotal(), cliente); 
	}
}
