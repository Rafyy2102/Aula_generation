package com.example.LojadeGames.model;

import java.math.BigDecimal;
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
@Table(name = "tb_Produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 1, max = 150)
	private String titulo;
	
	@NotNull	
	private BigDecimal preco;
	
	@NotNull
	private int quantidade;
	
	@NotNull
	private boolean estoque;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	public String getTutulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public BigDecimal getPreco() {return preco;}
	public void setPreco(BigDecimal preco) {this.preco = preco;}
	public int getQuantidade() {return quantidade;}
	public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
	public boolean isEstoque() {return estoque;}
	public void setEstoque(boolean estoque) {this.estoque = estoque;}
	public Categoria getCategoria() {return categoria;}
	public void setCategoria(Categoria categoria) {	this.categoria = categoria;}
}