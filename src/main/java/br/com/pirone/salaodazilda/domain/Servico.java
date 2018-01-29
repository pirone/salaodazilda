package br.com.pirone.salaodazilda.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

import br.com.pirone.salaodazilda.common.GenericEntity;
import br.com.pirone.salaodazilda.enums.SituacaoAtivo;
import br.com.pirone.salaodazilda.util.converter.SituacaoAtivoConverter;


/**
 * The persistent class for the servico database table.
 * 
 */
@Entity
@NamedQuery(name="Servico.findAll", query="SELECT s FROM Servico s")
public class Servico implements Serializable, GenericEntity {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_servico")
	private Integer id;

	private String descricao;

	private String nome;

	private BigDecimal preco;
	
	
	@ManyToOne
	@JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
	private CategoriaServico categoria;
	
	@NotNull
	@Convert(converter = SituacaoAtivoConverter.class)
	private SituacaoAtivo st_ativo;

	public Servico() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return this.preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public CategoriaServico getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaServico categoria) {
		this.categoria = categoria;
	}

	public SituacaoAtivo getSituacao() {
		return st_ativo;
	}

	public void setSituacao(SituacaoAtivo situacao) {
		this.st_ativo = situacao;
	}

}