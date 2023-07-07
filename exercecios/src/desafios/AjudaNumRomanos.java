package desafios;

public class AjudaNumRomanos {
	//Essa Função Converte Numeros Inteiros Para Numeros Romanos
	public static int converterRomanoParaArabico(String numeroRomano) {
        int numeroArabico = 0;
        int tamanho = numeroRomano.length();

        //Estou separando os caracteres do numeros romanos e ar
        for (int i = 0; i < tamanho; i++) {
            char algarismoAtual = numeroRomano.charAt(i);

            if (i < tamanho - 1) {
                char algarismoSeguinte = numeroRomano.charAt(i + 1);

                int valorAtual = obterValorAlgarismo(algarismoAtual);
                int valorSeguinte = obterValorAlgarismo(algarismoSeguinte);

                if (valorAtual < valorSeguinte) {
                    numeroArabico -= valorAtual;
                } else {
                    numeroArabico += valorAtual;
                }
            } else {
                numeroArabico += obterValorAlgarismo(algarismoAtual);
            }
        }

        return numeroArabico;
    }
	public static String converterArabicoParaRomano(int numeroArabico) {
        if (numeroArabico <= 0 || numeroArabico > 3999) {
            throw new IllegalArgumentException("Número arábico inválido. O número deve estar entre 1 e 3999.");
        }

        StringBuilder numeroRomano = new StringBuilder();

        int[] valoresArabicos = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] valoresRomanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        int indice = 0;

        while (numeroArabico > 0) {
            int divisor = valoresArabicos[indice];

            if (numeroArabico >= divisor) {
                numeroRomano.append(valoresRomanos[indice]);
                numeroArabico -= divisor;
            } else {
                indice++;
            }
        }

        return numeroRomano.toString();
    }

    public static int obterValorAlgarismo(char algarismo) {
        switch (algarismo) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Algarismo romano inválido: " + algarismo);
        }
    }

}
