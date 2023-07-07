package ClassEModulo;

public class dataTeste {
	int dia;
	int mes;
	int ano;
	
	String dataFormada(){
		return String.format("%d/%d/%d", dia,mes,ano);
	}
	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d", dia,mes,ano);
	}
	

}
