package orietanacao;

public class pessoa {
	String pessoa;
	int idade;
	double peso;
	double caloriasAtual;
	double contador = 0;
	int a = 0;

	void comer(comida comida){
		double caloriasDodia = caloriasAtual + comida.caloriasComida;
		double calculo =  Math.round(caloriasDodia  - caloriasAtual);
		contador = calculo;
		
			if(calculo >= 0.0){
				for(int i = 0; i< contador;i++) {
					a++;
					System.out.println("Pessoa engordou "+ a + "kg" );
						
					}
			
			for(int i = 0; i< contador;i++) {
			peso += 1.0;
			
			}
			System.out.println("O nome da pessoa é : " + pessoa + "\nA idade é : " + idade + "\nO peso dela no Inicio do dia era : " + peso + "\nA Comida que ela comeu foi + " + comida.comida + "\n A calorias do dia foi : "  + comida.comida);
			
		}else {
			System.out.println("Não engordou nada no dia");
		}
	}
	

}
