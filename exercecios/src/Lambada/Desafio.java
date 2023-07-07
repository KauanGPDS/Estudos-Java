package Lambada;


import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto p = new Produto("Ipad",3235.89,0.13);
		
		UnaryOperator<Double> precoComDescont = valor
				-> (p.preco * p.desconto) /100;
		UnaryOperator<Double> imposto = n ->{
			double valor = (p.preco * 8.5)/100;
			if(p.preco >= 2500.0) {
				return p.preco +  valor;
			}else {
				return p.preco +  0;
			}
		};
		UnaryOperator<Double> frete = n -> {
			if(p.preco >= 3000.0) {
				return p.preco + 100.0; 
			}else{
				return p.preco + 50.0;
			}
			};
		Function<Double,String> formata = n ->{
		DecimalFormat formato = new DecimalFormat("0.00");
	    String valorFormatado = formato.format(p.preco).replace(".", ",");
	    return "R$ " +valorFormatado;
		};
		
		Double resultado = precoComDescont.andThen(imposto).andThen(frete).apply(p.preco);
		String formatado1 =  formata.apply(resultado);
		System.out.println(formatado1);
	}

}
