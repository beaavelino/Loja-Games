package com.generation.lojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 5, max = 20)
	private String tipo; // Tipo do produto. Ex: (A- Eletronico. B- Jogos. C- Objetos)

	@NotNull
	@Size(min = 10, max = 100)
	private String descricao; // descricao do produto

	@NotNull
	@Size(min = 5, max = 20)
	private String alertaIdade; // Alerta sobre a idade de indicação Exemplo de escrita:
								// "Sou maior de idade"; "Sou menor de idade"
	
	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Produto produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getdescricao() {
		return descricao;
	}

	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAlertaIdade() {
		return alertaIdade;
	}

	public void setAlertaIdade(String alertaIdade) {
		this.alertaIdade = alertaIdade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
