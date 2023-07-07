package generics;

public class caixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.aguarda(2.3);
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.aguarda("Ola");
		
		String coisa2 = (String) caixaB.abrir();
		System.out.println(coisa2);
	}

}
