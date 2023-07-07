package Lambada;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> IsTresDigitos = 
				num -> num >= 100 && num <= 999;

		System.out.println(isPar.and(IsTresDigitos).test(122));
		System.out.println(isPar.or(IsTresDigitos).test(123));
				
	}

}
