package k2;

public class Pokemons {
	 private String nome;
	    private double altura;
	    private double peso;
	    private String regiao;
	    private String tipo;
	    private String tipo2;


	    public Pokemons(String nome, double altura, double peso, String regiao, String tipo, String tipo2) {
	        this.nome = nome;
	        this.altura = altura;
	        this.peso = peso;
	        this.regiao =  regiao;
	        this.tipo = tipo;
	        this.tipo2 = tipo2;
	        }

	    public double getAltura() {
	        return altura;
	    }
	    public void setAltura(double altura) {
	        this.altura = altura;
	    }
	    public double getPeso() {
	        return peso;
	    }
	    public void setPeso(double peso) {
	        this.peso = peso;
	    }


	    public String getNome() {
	        return nome;
	    }
	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getRegiao() {
	        return regiao;
	    }
	    public void setRegiao(String regiao) {
	        this.regiao = regiao;
	    }


	    public String getTipo() {
	        return tipo;
	    }
	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }
	    public String getTipo2() {
	        return tipo2;
	    }
	    public void setTipo2(String tipo2) {
	        this.tipo2 = tipo2;
	    }


}
