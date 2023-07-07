package ArrayCollections;

import java.util.Scanner;

public class QUETSTAO1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        double filhoSTOTAL = 0;
        double salariOMaior = 0;
        double saliorM = 999999999;
        double RendaMer = 0;
        double RendaMaior = 999999999;

        System.out.println("Quantidade de Famílias:");
        int i = sc.nextInt();

        for (int j = 0; j < i; j++) {
            System.out.println("Qual o salário do marido " + j + "?");
            double salariomarido = sc.nextDouble();
            if (salariomarido >= 1500) {
                cont++;
            }
            if (salariomarido == -1) {
                sc.close();
                break;
            }

            System.out.println("Qual o salário da esposa " + j + "?");
            double salarioesposa = sc.nextDouble();
            if (salarioesposa >= 1500) {
                cont++;
            }
            if (salarioesposa == -1) {
                sc.close();
                break;
            }

            if (salarioesposa > salariOMaior) {
                salariOMaior = salarioesposa;
            } else if (salariomarido > salariOMaior) {
                salariOMaior = salariomarido;
            }

            if (salarioesposa < saliorM) {
                saliorM = salarioesposa;
            } else if (salariomarido < saliorM) {
                saliorM = salariomarido;
            }

            System.out.println("Quantos filhos o casal " + j + " tem?");
            int filhos = sc.nextInt();
            filhoSTOTAL += filhos;

            double rendafamiliar = ((salariomarido + salarioesposa) / (filhos + 2));
            System.out.println("A Média de renda familiar da família " + j + " é " + rendafamiliar);

            if (rendafamiliar > RendaMer) {
                RendaMer = rendafamiliar;
            } else if (rendafamiliar < RendaMaior) {
                RendaMaior = rendafamiliar;
            }
        }

        System.out.println("A Média do número de filhos por família é " + filhoSTOTAL / i);
        System.out.println("A Média da maior renda da família é " + RendaMer);
        System.out.println("A Média da menor renda da família é " + RendaMaior);
        System.out.println("O maior salário é " + salariOMaior);
        System.out.println("O menor salário é " + saliorM);
        System.out.println("A média de pessoas que ganham mais de R$1500 é " + (cont / i) * 100 + "%");

        sc.close();
    }
	    
	}

