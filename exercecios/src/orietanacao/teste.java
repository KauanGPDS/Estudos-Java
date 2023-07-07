package orietanacao;

public class teste {
	public static void main(String[] args) {
		
		double caloriasAtual = 67;
		double contador = 0;
		double peso = 67.0;
		
		double caloriasDodia = caloriasAtual + 3.1;
		double calculo =  Math.round(caloriasDodia  - caloriasAtual);
		contador = calculo;
		
				if(calculo >= 1.0){
					for(int i = 0; i< contador;i++) {
						System.out.println("Pessoa engordou "+ contador + "kg" );
						
						}
			
			for(int i = 0; i< contador;i++) {
			peso += 1.0;
			
			}
			System.out.println(peso);
			
		}else {
			System.out.println("Não engordou nada no dia");
		}
	}

}
