package desafios;

import java.util.Scanner;

public class tarefa1 {
	public static void main(String[] args) {
		
		AjudaNumRomanos a = new AjudaNumRomanos();
		Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de números romanos");
        System.out.println("----------------------------");

        System.out.println("Escolha uma opção:");
        System.out.println("1. Converter número romano para arábico");
        System.out.println("2. Converter número arábico para romano");

        int opcao = scanner.nextInt();
        scanner.nextLine(); 

        if (opcao == 1) {
            System.out.print("Digite o número romano: ");
            String numeroRomano = scanner.nextLine().toUpperCase();
            int numeroArabico = a.converterRomanoParaArabico(numeroRomano);
            System.out.println("O número arábico correspondente é: " + numeroArabico);
        } else if (opcao == 2) {
            System.out.print("Digite o número arábico (entre 1 e 3999): ");
            int numeroArabico = scanner.nextInt();
            String numeroRomano = a.converterArabicoParaRomano(numeroArabico);
            System.out.println("O número romano correspondente é: " + numeroRomano);
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

	}


