package padrao;

public class festaSupresa {
	public static void main(String[] args) {
		namorada namora = new namorada();
		porteiro porteiro = new porteiro();
		porteiro.registrarObservador(namora);
		porteiro.monitorar();
	}

}
