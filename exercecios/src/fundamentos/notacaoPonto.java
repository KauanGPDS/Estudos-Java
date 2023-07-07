package fundamentos;

public class notacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!!");
		System.out.println(s);
		String nome = "leorio".toUpperCase();
		System.out.println(nome);
		
		String y = "Bom Dia X".replace("X", "Gui").toUpperCase();
		System.out.println(y);
	}

}
