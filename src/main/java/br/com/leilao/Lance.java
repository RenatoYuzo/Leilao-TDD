package br.com.leilao;

public class Lance {

	private String nomeUsuario;
	private double valorLance;
	
	public Lance(String nomeUsuario, double valorLance) {
		this.nomeUsuario = nomeUsuario;
		this.valorLance = valorLance; 
	}

	public String getNomeUsuario() {
		return this.nomeUsuario;
	}

	public double getValorLance() {
		return this.valorLance;
	}
	
}