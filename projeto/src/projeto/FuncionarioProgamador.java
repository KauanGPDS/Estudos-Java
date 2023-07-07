package projeto;

public class FuncionarioProgamador extends SubFuncionario {

	String nome;
	int anosDeEmpresa;
	String dev;
	String linguagem;
	String cargo = "Progamador";
	public FuncionarioProgamador(String dev, String linguagem,String nome,int anosDeEmpresa,int idade) {
		this.dev = dev;
		this.linguagem = linguagem;
		this.nome = nome;
		this.anosDeEmpresa =anosDeEmpresa;
		this.idade = idade;
	}
	 public String getNome() {
	        return nome;
	    }
	public FuncionarioProgamador() {}
	public String getCargo() {
		return cargo;
	}
	 public void setNome(String nome) {
	        this.nome = nome;
	    }
	public int getAnosDeEmpresa() {
		return anosDeEmpresa;
	}
	public void setAnosDeEmpresa(int anosDeEmpresa) {
		this.anosDeEmpresa = anosDeEmpresa;
	}
	public String getDev() {
		return dev;
	}
	public void setDev(String dev) {
		this.dev = dev;
	}
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
