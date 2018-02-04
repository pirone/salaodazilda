package br.com.pirone.salaodazilda.web.lancamento.consultar;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.Cliente;
import br.com.pirone.salaodazilda.domain.Funcionario;
import br.com.pirone.salaodazilda.domain.LancamentoEntrada;
import br.com.pirone.salaodazilda.domain.Servico;
import br.com.pirone.salaodazilda.enums.FormaPagamento;
import br.com.pirone.salaodazilda.enums.TipoLancamento;
import br.com.pirone.salaodazilda.to.LancamentoTO;

@Named
@SessionScoped
public class ConsultarLancamentoView implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private LancamentoTO lancamento;
	private List<LancamentoEntrada> resultado;
	
	private List<Funcionario> listaFuncionarios;
	private List<Cliente> listaClientes;
	private List<Servico> listaServico;


	public LancamentoTO getLancamento() {
		return lancamento;
	}

	public void setLancamento(LancamentoTO lancamento) {
		this.lancamento = lancamento;
	}

	public List<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Servico> getListaServico() {
		return listaServico;
	}

	public void setListaServico(List<Servico> listaServico) {
		this.listaServico = listaServico;
	}
	
	public List<LancamentoEntrada> getResultado() {
		return resultado;
	}

	public void setResultado(List<LancamentoEntrada> resultado) {
		this.resultado = resultado;
	}

	public TipoLancamento[] getTiposLancamento() {
		return TipoLancamento.values();
	}
	
	public FormaPagamento[] getFormasPagamento() {
		return FormaPagamento.values();
	}



}
