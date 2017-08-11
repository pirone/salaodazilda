package br.com.pirone.salaodazilda.web.lancamento;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.pirone.salaodazilda.domain.Cliente;
import br.com.pirone.salaodazilda.domain.Funcionario;
import br.com.pirone.salaodazilda.domain.Lancamento;
import br.com.pirone.salaodazilda.domain.Servico;
import java.io.Serializable;

@Named
@ViewScoped
public class IncluirLancamentoView implements Serializable {
	
	private static final long serialVersionUID = 5841355323119395205L;
	
	private List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
	private List<Cliente> listaClientes;
	private List<Servico> listaServico;
	
	private Lancamento lancamentoInclusao;

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

	public Lancamento getLancamentoInclusao() {
		return lancamentoInclusao;
	}

	public void setLancamentoInclusao(Lancamento lancamentoInclusao) {
		this.lancamentoInclusao = lancamentoInclusao;
	}

}
