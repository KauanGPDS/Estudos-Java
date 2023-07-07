package padrao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class porteiro {
	private List<chegadaAniversariante> observadores = new ArrayList<>();
	public void registrarObservador(chegadaAniversariante o) {
		observadores.add(o);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou ?");
			valor = entrada.nextLine();
			if("sim".equalsIgnoreCase(valor)) {
				eventoChegada evento = new eventoChegada(new Date());
				
				observadores.stream().forEach(o -> o.chegou(evento));
			}else {
				System.out.println("Alarme Falso");
			}
		}
		
		entrada.close(); 
	}

}
