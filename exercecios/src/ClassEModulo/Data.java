package ClassEModulo;

public class Data {
	public static void main(String[] args) {
		dataTeste d1 = new dataTeste();
		d1.ano = 1990;
		d1.dia = 27;
		d1.mes = 03;
		
		var d2 = new dataTeste();
		d2.ano = 1930;
		d2.dia = 01;
		d2.mes = 12;
		
		String dataFormatada1 = d2.dataFormada();
		
		System.out.println(dataFormatada1);
		System.out.println(d1.dataFormada());
		
		d1.imprimirDataFormatada();
		
	}

}
