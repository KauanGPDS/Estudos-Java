package trabalhoFacil;

import java.util.Objects;

public class p2 {
	private String nome2;
	private double peso;
	private double altura;
	public String tipo1;
	public String tipo2;

	
	
	public p2() {
		
	}
	public p2(String nome, double peso, double altura, String tipo1, String tipo2) {
		super();
		this.nome2 = nome;
		this.peso = peso;
		this.altura = altura;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
	}
	public String getNome() {
		return nome2;
	}
	public void setNome(String nome) {
		this.nome2 = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getTipo1() {
		return tipo1;
	}
	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}
	public String getTipo2() {
		return tipo2;
	}
	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}
	@Override
	public int hashCode() {
		return Objects.hash(altura, nome2, peso, tipo1, tipo2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		p2 other = (p2) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Objects.equals(nome2, other.nome2)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Objects.equals(tipo1, other.tipo1) && Objects.equals(tipo2, other.tipo2);
	}
	
	
	

}
