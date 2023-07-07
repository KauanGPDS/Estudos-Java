package Lambada;



import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana","gui","lia","bia");
		
		System.out.println("Forma Tradicional...");
		for (String string : aprovados) {
			System.out.println(string);
		}
		
		System.out.println("\nLambida 01...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Referenc...");
		aprovados.forEach(System.out::println);
		
        System.out.println("\nLambida 02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
        System.out.println("\nMethod Referenc 02...");
		aprovados.forEach(Foreach::meuImprimir);
		
	}
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
	}

}
