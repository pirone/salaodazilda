package br.com.pirone.salaodazilda.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.com.pirone.salaodazilda.common.GenericEntity;
import br.com.pirone.salaodazilda.enums.SituacaoAtivo;
import br.com.pirone.salaodazilda.util.converter.SituacaoAtivoConverter;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name = "funcionario")
@NamedQuery(name="Funcionario.findAll", query="SELECT c FROM Funcionario c")
public class Funcionario implements Serializable, GenericEntity {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_funcionario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

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

	public Integer getId() {
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

	public void setSituacao(SituacaoAtivo st_ativo) {
		this.st_ativo = st_ativo;
	}

}