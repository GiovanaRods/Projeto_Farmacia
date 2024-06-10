package com.generation.farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")

public class Categorias {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull (message = "O atributo quantidade é obrigatório")
	@PositiveOrZero
	private int quantidade;
	
	@NotBlank (message = "O atributo descrição é obrigatório")
	@Size (min = 10, max = 100, message = "Descrição deve ter entre 10 e 100 caracteres")
	private String descricao;
	
	@NotBlank (message = "O atributo administração é obrigatório")
	@Size (min = 4, max = 100, message = "Administração deve ter entre 4 e 100 caracteres")
	private String administracao;

	@NotBlank (message = "O atributo perfumaria é obrigatório")
	@Size (min = 5, max = 50, message = "Perfumaria deve ter entre 5 e 50 caracteres")
	private String perfumaria;
	
	@NotBlank (message = "O atributo titulo é obrigatório")
	@Size (min = 10, max = 100, message = "Título deve ter entre 10 e 100 caracteres")
	private String titulo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAdministracao() {
		return administracao;
	}

	public void setAdministracao(String administracao) {
		this.administracao = administracao;
	}

	public String getPerfumaria() {
		return perfumaria;
	}

	public void setPerfumaria(String perfumaria) {
		this.perfumaria = perfumaria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
