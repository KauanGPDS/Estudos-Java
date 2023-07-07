package projeto;

public class SubFuncionario  extends Funcionario {
	
	//Aqui Recebe Os Atributos de funcionarios como Lixeiro,Design,Advogados e etc...
	FuncionarioProgamador p;
	String nome;
	String cargo;
	int idade;
	int anosDeEmpresa;
	String sexo;
	public SubFuncionario(String nome, String cargo, int idade, int anosDeEmpresa, String sexo) {
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.anosDeEmpresa = anosDeEmpresa;
		this.sexo = sexo;
	}
	 public String getNome() {
	        return nome;
	    }
	
	public SubFuncionario() {}
	public String getCargo() {
		return cargo;
	}
	
	 public void setNome(String nome) {
	        this.nome = nome;
	    }
	public FuncionarioProgamador getP() {
		return p;
	}
	public void setP(FuncionarioProgamador p) {
		this.p = p;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getAnosDeEmpresa() {
		return anosDeEmpresa;
	}
	public void setAnosDeEmpresa(int anosDeEmpresa) {
		this.anosDeEmpresa = anosDeEmpresa;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

	 
}
