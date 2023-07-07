package Lambada;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {

	public static void main(String[] args) {
		//int -> Double
		// double - > double 
		
		BinaryOperator<Double> soma = (x,y) ->{
			return x + y;
		};
		System.out.println(" " + soma.apply(3.0, 4.0));
		soma = (x,y) -> x *y;
		System.out.println(soma.apply(3.0, 4.0));
		
		BinaryOperator<Integer> somaI = (x,y) ->{
			return x + y;
		};
		System.out.println(somaI.apply(3, 4));
		soma = (x,y) -> x *y;
		System.out.println(somaI.apply(3, 4));
	}
	}

