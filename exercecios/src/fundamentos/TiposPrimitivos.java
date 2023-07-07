package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informaçoes de um funcionario
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipo Numericos Reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		
		boolean estaDeFerias = false;//true
				
		//Tipo caractere
		char status = 'A';//ativo
		
		//dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos/2);
		
		//Ponto por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		System.out.println(id + ": ganha " + salario);	
		System.out.println("ferias?"+ estaDeFerias);
		System.out.println("Status ?" + status);
		
		
	}

}
