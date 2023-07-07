package Lambada;

public class calculoTeste {

	public static void main(String[] args) {
		Calculo soma = (x,y) ->{
			return x + y;
		};

		System.out.println(" " + soma.executar(3, 4));
		soma = (x,y) -> x *y;
		System.out.println(soma.executar(3, 4));
	}
}
