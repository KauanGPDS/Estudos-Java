package projeto;

import java.util.Iterator;
import java.util.Scanner;


public class Progama {

	public static void main(String[] args) {
	    Funcionario f = new Funcionario();
	    Scanner sc = new Scanner(System.in);

	    do {
	        System.out.println("");
	        System.out.println("1-Cadastrar Funcionario\n2-Listar Funcionarios\n3-Pesquisa funcionario Por nome\n4-alterar Progamador\5-alterar Funcionario Comum");
	        int opcao = sc.nextInt();
	        switch (opcao) {
	            case 1:
	                System.out.println("Deseja adicionar um funcionario Comum ou Progamdor ?");
	                String fun = sc.next();
	                if (fun.equals("Comum")) {
	                    System.out.println("Qual Nome Do Funcionario ? ");
	                    String nome = sc.next();
	                    System.out.println("Qual Cargo Do Funcionario ? ");
	                    String cargo = sc.next();
	                    System.out.println("Qual Idade Do Funcionario ? ");
	                    int idade = sc.nextInt();
	                    System.out.println("Quantos Anos De Empresa Esse Funcionrio Tem ? ");
	                    int AnosDeEmpresa = sc.nextInt();
	                    System.out.println("Qual Sexo Do Funcionario ? ");
	                    String Sexo = sc.next();
	                    f.adicionarFuncionarioComumAEmpresa(nome, cargo, idade, AnosDeEmpresa, Sexo);
	                    break;
	                } else if (fun.equals("Progamador")) {
	                    System.out.println("Qual Nome Do Progamador ? ");
	                    String nome = sc.next();
	                    System.out.println("Qual Linguagem Do Progamador ? ");
	                    String cargo = sc.next();
	                    System.out.println("Ele é back-end ou Front-end ?");
	                    String eps = sc.next();
	                    System.out.println("Qual Idade Do Progamador ? ");
	                    int idade = sc.nextInt();
	                    System.out.println("Quantos Anos De Empresa Esse Progamador Tem o ? ");
	                    int AnosDeEmpresa = sc.nextInt();
	                    f.adicionarProgamadorAEmpresa(eps, cargo, nome, AnosDeEmpresa, idade);
	                    break;
	                }
	            case 2:
	                f.listaFuncionario();
	                break;
	            case 3:
	            	System.out.println("Quem você quer procurar?");
	                String nome = sc.next();
	                String resultadoBusca = f.encontrarPorNome(nome);
	                System.out.println(resultadoBusca);
	                break;
	            case 4:
	            	System.out.println("Qual funcionario deseja alterar o Nome ?");
	            	String nome1 = sc.next();
	            	f.modificarProgamador(nome1);
	            	break;
	            default:
	                System.out.println("Opção inválida");
	                break;
	        }
	    } while (true);
	}

}
