package br.com.pirone.salaodazilda.domain;

import br.com.pirone.salaodazilda.domain.Lancamento;
import br.com.pirone.salaodazilda.enums.FormaPagamento;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: LancamentoEntrada
 *
 */
@Entity
@Table(name = "lancamento_entrada")
@PrimaryKeyJoinColumn(name="id_lancamento")
public class LancamentoEntrada extends Lancamento implements Serializable {

	private static final long serialVersionUID = 1L;

	public LancamentoEntrada() {
		super();
	}
	
	@ManyToOne
	@JoinColumn(name = "id_funcionario", referencedColumnName = "id_funcionario")
	private Funcionario funcionario;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_servico")
	private Servico servico;
	
	@Column(name = "forma_pagamento")
	private FormaPagamento formaPagamento;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

   
}
