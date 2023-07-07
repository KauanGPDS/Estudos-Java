package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Funcionario {

	Scanner scan = new Scanner(System.in);
	private List<FuncionarioProgamador> progamadores = new ArrayList<>();
	private List<SubFuncionario> profosionais  = new ArrayList<>();
	private int quantidadeDeFuncionarios;
	FuncionarioProgamador fp;
	
	

	
	void adicionarFuncionarioComumAEmpresa(String nome,String cargo,int idade,int anosDeEmpresa,String sexo) {
		this.profosionais.add(new SubFuncionario(nome,cargo,idade,anosDeEmpresa,sexo));
		quantidadeDeFuncionarios++;
		}
	void adicionarProgamadorAEmpresa(String dev,String linguagem,String nome,int anosDeEmpresa,int idade) {
		this.progamadores.add(new FuncionarioProgamador(dev,linguagem,nome,anosDeEmpresa,idade));
		quantidadeDeFuncionarios++;
	}
	
	
	public String toString1(SubFuncionario funcionario) {
		return "Nome : " + funcionario.nome + "\nCargo : " + funcionario.cargo + "\nIdade : " + funcionario.idade + "\nAnos De Empresa : " + funcionario.anosDeEmpresa ;
	}
	public String toStringProgamador(FuncionarioProgamador progamadores) {
		return "Nome : " + progamadores.nome + "\nLinguagem : " + progamadores.linguagem+ "\nEspecialidade : "+ progamadores.dev + "\nIdade : " + progamadores.idade +"\nAnos De Empresa : " + progamadores.anosDeEmpresa;
	}
	void listaFuncionario() {
		profosionais.addAll(progamadores);
		int n = profosionais.size();
		boolean trocou;
		do {
	        trocou = false;
	        for (int i = 0; i < n - 1; i++) {
	            SubFuncionario atual = profosionais.get(i);
	            SubFuncionario proximo = profosionais.get(i + 1);

	            if (atual.anosDeEmpresa > proximo.anosDeEmpresa) {
	                profosionais.set(i, proximo);
	                profosionais.set(i + 1, atual);
	                trocou = true;
	            }
	        }
	        n--;
	    } while (trocou);
		
		for (SubFuncionario subFuncionario : profosionais) {
			System.out.println(toString1(subFuncionario));
			 System.out.println("-----------------------------");
			 if (subFuncionario instanceof FuncionarioProgamador) {
			        FuncionarioProgamador progamador = (FuncionarioProgamador) subFuncionario;
			        System.out.println(toStringProgamador(progamador));
			        System.out.println("-----------------------------");
			    }
		}
	}

	 
	    // Resto do código da classe...

	public String encontrarPorNome(String nome) {
	    for (SubFuncionario funcionario : profosionais) {
	        if (funcionario.getNome().equals(nome)) {
	            return "Nome: " + funcionario.getNome() + "\nCargo: " + funcionario.getCargo();
	        }
	    }
	    return "Funcionário não encontrado.";
	}
	 public String modificarProgamador(String nome) {
	        SubFuncionario funcionarioEncontrado = null;
	        
	        for (SubFuncionario funcionario : profosionais) {
	            if (funcionario.getNome().equals(nome)) {
	                funcionarioEncontrado = funcionario;
	                break;
	            }
	        }
	        
	        if (funcionarioEncontrado != null) {
	            System.out.println("Deseja alterar o nome? (s/n)");
	            String alterarNome = scan.next();
	            
	            if (alterarNome.equals("s")) {
	                System.out.println("Qual nome você deseja definir?");
	                String novoNome = scan.next();
	                
	                if (funcionarioEncontrado instanceof FuncionarioProgamador) {
	                    FuncionarioProgamador progamador = (FuncionarioProgamador) funcionarioEncontrado;
	                    progamador.setNome(novoNome);
	                    System.out.println("Deseja alterar a linguagem ?");
	    	        	String alterarlingugagem = scan.next();
	    	        	if(alterarlingugagem.equals("s")) {
	    	        		System.out.println("Qual linguagem quer botar ?");
	    	        		String novaLinguagem = scan.next();
	    	        		 
	    	               
	    	                }
	    	        	return progamador.getDev() + " " + progamador.getNome();
	                } else {
	                    funcionarioEncontrado.setNome(novoNome);
	                    return funcionarioEncontrado.getNome();
	                }
	            }
	        }else {
	        	System.out.println("Deseja alterar a linguagem ?");
	        	String alterarlingugagem = scan.next();
	        	if(alterarlingugagem.equals("s")) {
	        		System.out.println("Qual linguagem quer botar ?");
	        		String novaLinguagem = scan.next();
	        		 
	                if (funcionarioEncontrado instanceof FuncionarioProgamador) {
	                    FuncionarioProgamador progamador = (FuncionarioProgamador) funcionarioEncontrado;
	                    progamador.setDev(novaLinguagem);
	                    return progamador.getDev();
	                }
	        		
	        	}
	        }
	        
	        return null;
	    }

	 
	
	@Override
	public int hashCode() {
		return Objects.hash(profosionais, progamadores, quantidadeDeFuncionarios);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(profosionais, other.profosionais) && Objects.equals(progamadores, other.progamadores)
				&& quantidadeDeFuncionarios == other.quantidadeDeFuncionarios;
	}
	
	
	
	

}
