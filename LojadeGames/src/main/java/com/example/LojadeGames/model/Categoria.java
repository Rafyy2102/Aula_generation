package com.example.LojadeGames.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 1, max = 100)
	private String categoria;
	
	@NotNull
	@Size(min = 1, max = 100)
	private String descricao;
	
	@NotNull
	private boolean ativo;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produtos;
	
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}	
	public String getCategoria() {return categoria;	}
	public void setCategoria(String categoria) {this.categoria = categoria;}
	public String getDescricao() {return descricao;}
	public void setDescricao(String descricao) {this.descricao = descricao;}
	public boolean isAtivo() {return ativo;}
	public void setAtivo(boolean ativo) {this.ativo = ativo;}
	public List<Produto> getProdutos() {return produtos;}
	public void setProdutos(List<Produto> produtos) {this.produtos = produtos;}
}