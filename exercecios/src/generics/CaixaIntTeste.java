package generics;

public class CaixaIntTeste {
	public static void main(String[] args) {
		CaixaInt CaixaA = new CaixaInt();
		CaixaA.aguarda(123);
		
		
		Integer coisaA = CaixaA.abrir();
		System.out.println(coisaA);
	}

}
