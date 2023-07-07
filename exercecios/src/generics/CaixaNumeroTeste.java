package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		CaixaNumero<Double> cai = new CaixaNumero<>();
		cai.aguarda(3.2);
		
		System.out.println(cai.abrir());
	}

}
