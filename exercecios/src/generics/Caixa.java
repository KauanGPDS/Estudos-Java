package generics;

public class Caixa<TIPO>{

private TIPO coisa;
	
	public void aguarda(TIPO coisa){
		this.coisa = coisa;
	}
	public TIPO abrir() {
		return coisa;
	}
}
