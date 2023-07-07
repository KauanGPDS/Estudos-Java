package orietanacao;

public class data {
	int dia;
	int mes;
	int ano;
	String formato = "%d/%d/%d\n";
	
	
	data(){ 
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1,1,1970);
	}
	data(int dia,int mes,int ano){
		this.dia = dia;
		this.mes =mes;
		this.ano = ano;
		
	}
	String dataFormatada() {
	
		return String.format(formato,dia,mes,ano);
	}
	void ImprimirDataFormata() {
		String formato = "...";
		System.out.println(this.dataFormatada());
	}
	
		
	}


