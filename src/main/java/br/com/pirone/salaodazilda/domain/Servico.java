package br.com.pirone.salaodazilda.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

import br.com.pirone.salaodazilda.enums.SituacaoAtivo;
import br.com.pirone.salaodazilda.enums.SituacaoAtivoConverter;


/**
 * The persistent class for the servico database table.
 * 
 */
@Entity
@NamedQuery(name="Servico.findAll", query="SELECT s FROM Servico s")
public class Servico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idservico")
	private int idServico;

	private String descricao;

	private String nome;

	private BigDecimal preco;
	
	@NotNull
	@Convert(converter = SituacaoAtivoConverter.class)
	private SituacaoAtivo st_ativo;

	public Servico() {
	}

	public int getIdServico() {
		return this.idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
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

	public SituacaoAtivo getSituacao() {
		return st_ativo;
	}

	public void setSituacao(SituacaoAtivo situacao) {
		this.st_ativo = situacao;
	}

}