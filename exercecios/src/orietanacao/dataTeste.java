package orietanacao;

public class dataTeste {
	public static void main(String[] args) {
		data  d = new data();
		d.ano = 2021;
		
		
		var d2 = new data(04,12,2007);
		
		
		String dataFinal = d.dataFormatada();
		
		System.out.printf(dataFinal);
		System.out.printf("%d/%d/%d\n",d2.dia,d2.mes,d2.ano);
		
		d2.ImprimirDataFormata();
}
}
