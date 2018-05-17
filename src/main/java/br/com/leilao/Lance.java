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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeUsuario == null) ? 0 : nomeUsuario.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorLance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lance other = (Lance) obj;
		if (nomeUsuario == null) {
			if (other.nomeUsuario != null)
				return false;
		} else if (!nomeUsuario.equals(other.nomeUsuario))
			return false;
		if (Double.doubleToLongBits(valorLance) != Double.doubleToLongBits(other.valorLance))
			return false;
		return true;
	}
	
	
	
}