package br.com.pirone.salaodazilda.service.relatorio;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.LancamentoEntrada;
import br.com.pirone.salaodazilda.repository.ManterLancamentoRepository;
import br.com.pirone.salaodazilda.to.RelatorioFuncionarioPesqTO;
import br.com.pirone.salaodazilda.to.RelatorioFuncionarioTO;
import br.com.pirone.salaodazilda.util.Periodo;

@Named
@RequestScoped
public class RelatorioFuncionarioService {
	
	@Inject
	private ManterLancamentoRepository lancamentoRepository;
	
	public RelatorioFuncionarioTO consultarExtrato(RelatorioFuncionarioPesqTO filtro) {
		RelatorioFuncionarioTO relatorioTO = new RelatorioFuncionarioTO();
		relatorioTO.setFuncionario(filtro.getFuncionario());
		Periodo periodo = new Periodo(filtro.getMes(), filtro.getAno());
		relatorioTO.setLancamentosFuncionario(lancamentoRepository.consultarLancamentosEntrada(filtro.getFuncionario(), periodo));
		return relatorioTO;
	}

}
