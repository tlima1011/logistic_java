package com.logistic_java.entities;

public class ClienteFisica extends Cliente{
	
	private String rg; 
	private String cpf; 
	
	public ClienteFisica(String n) {
		super(n);
		rg = "N/A";
		cpf = "N/A"; 
	}
	
	public ClienteFisica(String n, String r, String c) {
		super(n); 
		this.rg = r; 
		this.cpf = c; 
	}

	@Override
	public String toString() {
		return "\nPessoa Fisica\nRG: " + rg + "\nCPF: " + cpf + "]";
	}
	
	

}
