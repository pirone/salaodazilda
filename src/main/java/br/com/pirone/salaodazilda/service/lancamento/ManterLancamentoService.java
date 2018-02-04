package br.com.pirone.salaodazilda.service.lancamento;

import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.pirone.salaodazilda.domain.LancamentoEntrada;
import br.com.pirone.salaodazilda.enums.TipoLancamento;
import br.com.pirone.salaodazilda.repository.ManterClienteRepository;
import br.com.pirone.salaodazilda.repository.ManterFuncionarioRepository;
import br.com.pirone.salaodazilda.repository.ManterLancamentoRepository;
import br.com.pirone.salaodazilda.repository.ManterServicoRepository;
import br.com.pirone.salaodazilda.to.LancamentoTO;

@RequestScoped
public class ManterLancamentoService {
	
	@Inject
	private ManterLancamentoRepository repository;
	
	@Inject 
	private ManterServicoRepository servicoRepository;
	
	@Inject 
	private ManterFuncionarioRepository funcionarioRepository;
	
	@Inject 
	private ManterClienteRepository clienteRepository;

	public ManterClienteRepository getClienteRepository() {
		return clienteRepository;
	}

	public void setClienteRepository(ManterClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public ManterLancamentoRepository getRepository() {
		return repository;
	}
	
	public ManterServicoRepository getServicoRepository() {
		return servicoRepository;
	}

	public ManterFuncionarioRepository getFuncionarioRepository() {
		return funcionarioRepository;
	}
	
	public void salvar(LancamentoEntrada lancamento) {
		lancamento.setDataLancamento(new Date());
		lancamento.setTipoLancamento(TipoLancamento.CREDITO);
		repository.incluir(lancamento);
	}
	
	public List<LancamentoEntrada> consultar(LancamentoTO lancamento) {
		return repository.consultarLancamentosEntrada(lancamento);
	}

}
