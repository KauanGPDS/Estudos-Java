package orietanacao;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		
		a++;
		b--;
		System.out.println(a + " " + b);
		
		data d1 = new data ( 1,6,2022);
		
		data d2 = d1;
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		d1.ImprimirDataFormata();
		d2.ImprimirDataFormata();
		voltarDataParaValorPadrao(d1);
		
		d1.ImprimirDataFormata();
		d2.ImprimirDataFormata();
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	static void voltarDataParaValorPadrao(data d) {
		d.dia= 1;
		d.mes =1;
		d.ano = 1970;
	}
	static void alterarPrimitivo(int a) {
		a++;
	}

}
