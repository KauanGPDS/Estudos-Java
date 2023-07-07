package modelo1para1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Assento")
public class Assento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	
	@OneToOne(mappedBy = "asento")
	private cliente cliente;

	public Assento() {

	}

	public Assento( String nome) {

		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	
}
