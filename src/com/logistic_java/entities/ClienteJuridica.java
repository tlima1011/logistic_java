package com.logistic_java.entities;

public class ClienteJuridica extends Cliente{
	
	private String ie; 
	private String cnpj; 
	
	public ClienteJuridica(String n) {
		super(n);
		ie = "N/A"; 
		cnpj = "N/A"; 
	}
	
	public ClienteJuridica(String n, String i) {
		super(n); 
		ie = i; 
		cnpj = "N/A"; 
	}
	
	public ClienteJuridica(String n, String i, String c) {
		super(n); 
		ie = i; 
		cnpj = c;  
	}

	@Override
	public String toString() {
		
		return String.format("Pessoa Juridica:\n%s\n%s", cnpj, ie);
		
	}
}
