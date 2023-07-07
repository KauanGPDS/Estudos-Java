package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa();
		caixaA.aguarda("Ola");
		
		String b = caixaA.abrir();
		System.out.println(b);
	}

}
