package com.logistic_java.entities;

public abstract class Cliente {
	
	private static int ultimoCodigo = 0; 
	private int idCliente; 
	private String nome; 
	private String telefone; 
	private String endereco; 
	
	public Cliente(String n, String t, String e) {
		this.idCliente = ++ultimoCodigo;
		this.nome = n; 
		this.telefone = t; 
		this.endereco = e; 
	}
	
	public Cliente(String n, String t) {
		this(n,t, "N/A"); 
	} 
	
	public Cliente(String n) {
		this(n,"(11) 0000 - 0000","N/A");
	}

	@Override
	public String toString() {
		return "Cliente"
				+ "\nId. Cliente: #" + idCliente 
				+ "\nNome: " + nome 
				+ "\nTelefone: " + telefone 
				+ "\nEndereco: " + endereco + "";
	}
	
	
	
	
	
}
