package ArrayCollections;

import java.util.Scanner;

public class faculdade {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int result = 0;
		double maiorRenda = 0;
		double menorRenda = 0;
		int contaodr = 1;
	
	do{
		System.out.println("Parar Encerar Digite : ( -1 )");
		int npe = entrada.nextInt();
		if(npe == -1) {
			result = -1;
		}else {
			System.out.println("Familia tem pai : (sim || nao) ");
			String pai = entrada.next();
			if(pai.equals("sim")) {
				int pai1 = 1;
				System.out.println("E mae : (sim || nao) ");
				String mae = entrada.next();
				if(mae.equals("sim")) {
					int mae1 = 1;
					System.out.println("Possui filhos : (sim || nao) ");
					String filhos = entrada.next();
					if(filhos.equals("sim")) {
						System.out.println("Quantos filhos :  ");
						int filhos1 = entrada.nextInt();
						System.out.println("Digite o Salario da mae : ");
						double salarioM = entrada.nextDouble();
						System.out.println("Digite o Salario do pai : ");
						double salarioP = entrada.nextDouble();
						if(salarioM >= salarioP) {
							maiorRenda = salarioM;
							menorRenda = salarioP;
							double media = (salarioP + salarioM)/(filhos1+2);
							System.out.println("Familia "+ contaodr+"\nPossui Mae : SIm " +"\n Possui Pai : SIm" + "\nPossui filhos : sim" + "\n Quantos filhos :" + filhos1 + "\n Salario Do Pai : " + salarioP + "\n Salario Mae : " + salarioM + "\nMedia Salarial " + media + "\nMenor Salario :" +  menorRenda + "\nMaior Renda : "+ maiorRenda);
						}else if(salarioP >= salarioM){
							double mediaPessoas = filhos1 +1 +1;
							double recebeMedia = mediaPessoas;
							double calculoMedia = mediaPessoas/contaodr;
							maiorRenda = salarioP;
							menorRenda = salarioM;
							double media1 = (salarioP + salarioM)/(filhos1+2);
							System.out.println("Familia "+ contaodr+"\nPossui Mae : SIm " +"\n Possui Pai : SIm" + "\nPossui filhos : sim" + "\n Quantos filhos :" + filhos1 + "\n Salario Do Pai : " + salarioP + "\n Salario Mae : " + salarioM + "\nMedia Salarial " + media1 + "\nMenor Salario :" +  menorRenda + "\nMaior Renda : "+ maiorRenda);
						}
						}
				}else {
					System.out.println("Possui filhos :(sim || nao) ");
					String filhos = entrada.next();
					if(filhos.equals("sim")) {
						System.out.println("Quantos filhos : ");
						int filhos1 = entrada.nextInt();
						System.out.println("Digite o Salario da mae : ");
						double salarioM = entrada.nextDouble();
						System.out.println("Digite o Salario do pai : ");
						double salarioP = entrada.nextDouble();
						if(salarioM >= salarioP) {
							maiorRenda = salarioM;
							menorRenda = salarioP;
							double media = (salarioP + salarioM)/(filhos1+2);
							System.out.println("Familia "+ contaodr+"\nPossui Mae : SIm " +"\n Possui Pai : SIm" + "\nPossui filhos : sim" + "\n Quantos filhos :" + filhos1 + "\n Salario Do Pai : " + salarioP + "\n Salario Mae : " + salarioM + "\nMedia Salarial " + media + "\nMenor Salario :" +  menorRenda + "\nMaior Renda : "+ maiorRenda);
						}else if(salarioP >= salarioM){
							double mediaPessoas = filhos1 +1 +1;
							double recebeMedia = mediaPessoas;
							double calculoMedia = mediaPessoas/contaodr;
							maiorRenda = salarioP;
							menorRenda = salarioM;
							double media1 = (salarioP + salarioM)/(filhos1+2);
							System.out.println("Familia "+ contaodr+"\nPossui Mae : SIm " +"\n Possui Pai : SIm" + "\nPossui filhos : sim" + "\n Quantos filhos :" + filhos1 + "\n Salario Do Pai : " + salarioP + "\n Salario Mae : " + salarioM + "\nMedia Salarial " + media1 + "\nMenor Salario :" +  menorRenda + "\nMaior Renda : "+ maiorRenda);
						}
						}
				}
				
			}else{
				System.out.println("E mae :(sim || nao) ");
				String mae = entrada.next();
				if(mae.equals("sim")) {
					int mae1 = 1;
					System.out.println("Possui filhos : (sim || nao)");
					String filhos = entrada.next();
					if(filhos.equals("sim")) {
						System.out.println("Quantos filhos : ");
						int filhos1 = entrada.nextInt();
						System.out.println("Digite o Salario da mae : ");
						double salarioM = entrada.nextDouble();
						System.out.println("Digite o Salario do pai : ");
						double salarioP = entrada.nextDouble();
						if(salarioM >= salarioP) {
							maiorRenda = salarioM;
							menorRenda = salarioP;
							double media = (salarioP + salarioM)/(filhos1+2);
							System.out.println("Familia "+ contaodr+"\nPossui Mae : Não" +"\n Possui Pai : SIm" + "\nPossui filhos : sim" + "\n Quantos filhos :" + filhos1 + "\n Salario Do Pai : " + salarioP + "\n Salario Mae : " + salarioM + "\nMedia Salarial " + media + "\nMenor Salario :" +  menorRenda + "\nMaior Renda : "+ maiorRenda);
						}else if(salarioP >= salarioM){
							double mediaPessoas = filhos1+1;
							double recebeMedia = mediaPessoas;
							double calculoMedia = mediaPessoas/contaodr;
							double result1 = 0;
							result1 += calculoMedia;
							maiorRenda = salarioP;
							menorRenda = salarioM;
							double media1 = (salarioP + salarioM)/(filhos1+2);
							System.out.println("Familia "+ contaodr+"\nPossui Mae : SIm " +"\n Possui Pai : Não" + "\nPossui filhos : sim" + "\n Quantos filhos :" + filhos1 + "\n Salario Do Pai : " + salarioP + "\n Salario Mae : " + salarioM + "\nMedia Salarial " + media1 + "\nMenor Salario :" +  menorRenda + "\nMaior Renda : "+ maiorRenda);
						}
				
			}else {
				System.out.println("Não tem filhos cabo");
			}
				}else {
				System.out.println("Cabo Familia tambem");
				}
			}
			
		}
		
		
	}while(result != -1);
	entrada.close();
			
			
			
		
	}

}
