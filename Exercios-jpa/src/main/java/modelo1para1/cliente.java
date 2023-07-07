package modelo1para1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
public class cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "assento_id",unique = true)
	private Assento asento;

	
	
	
	public cliente() {
	
	}

	public cliente(String nome, Assento asento) {
		super();
		this.nome = nome;
		this.asento = asento;
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

	public Assento getAsento() {
		return asento;
	}

	public void setAsento(Assento asento) {
		this.asento = asento;
	}
	
	
}
