package orietanacao;

public class janta {
	public static void main(String[] args) {
		pessoa p1 = new pessoa();
		comida c = new comida();
		comida c2 = new comida();
		p1.pessoa = "carlos";
		p1.peso = 65.0;
		p1.idade = 18;
		p1.caloriasAtual = 1.500;
		c.caloriasComida = 4.500;
		c2.caloriasComida = 5.000;
		c.comida = "Lasanha";
		
		
		p1.comer(c);
		
		
	}

}
