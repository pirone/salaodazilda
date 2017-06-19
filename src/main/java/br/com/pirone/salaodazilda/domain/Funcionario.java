package br.com.pirone.salaodazilda.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.com.pirone.salaodazilda.enums.SituacaoAtivo;
import br.com.pirone.salaodazilda.enums.SituacaoAtivoConverter;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Funcionario.findAll", query="SELECT c FROM Funcionario c")
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String cpf;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_nascimento")
	private Date dtNascimento;

	private String email;

	private String endereco;

	private String nome;
	
	private Double taxaComissao;
	
	private String telefone1;
	
	private String telefone2;
	
	private String telefone3;
	
	@NotNull
	@Convert(converter = SituacaoAtivoConverter.class)
	private SituacaoAtivo st_ativo;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(Double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}

	public SituacaoAtivo getSt_ativo() {
		return st_ativo;
	}

	public void setSt_ativo(SituacaoAtivo st_ativo) {
		this.st_ativo = st_ativo;
	}

}