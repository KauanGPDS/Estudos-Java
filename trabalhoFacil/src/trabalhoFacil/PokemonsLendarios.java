package trabalhoFacil;

import java.util.Objects;

public class PokemonsLendarios extends p2{
	

	
	private String definicao;
	private String regiao;
	

	
	
	

	public PokemonsLendarios() {
		super();
	}
	
	
	
	public PokemonsLendarios(String nome2, double peso, double altura, String tipo1, String tipo2,String definicao, String regiao) {
		super(nome2, peso, altura, tipo1, tipo2);
	
		this.definicao = definicao;
		this.regiao = regiao;
	}

	

	public String getDefinicao() {
		return definicao;
	}
	public void setDefinicao(String definicao) {
		this.definicao = definicao;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(definicao, regiao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PokemonsLendarios other = (PokemonsLendarios) obj;
		return Objects.equals(definicao, other.definicao) && Objects.equals(regiao, other.regiao);
	}
	
	

}
