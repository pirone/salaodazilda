package br.com.pirone.salaodazilda.repository;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import com.uaihebert.uaicriteria.UaiCriteria;
import com.uaihebert.uaicriteria.UaiCriteriaFactory;

import br.com.pirone.salaodazilda.config.GenericEntityManager;
import br.com.pirone.salaodazilda.domain.Funcionario;
import br.com.pirone.salaodazilda.domain.LancamentoEntrada;
import br.com.pirone.salaodazilda.to.LancamentoTO;
import br.com.pirone.salaodazilda.util.Periodo;

@RequestScoped
public class ManterLancamentoRepository extends GenericEntityManager implements Serializable {
	
	private static final long serialVersionUID = -9148342963533786109L;
	
	final UaiCriteria<LancamentoEntrada> uaiCriteria = UaiCriteriaFactory.createQueryCriteria(em, LancamentoEntrada.class);
	
	public List<LancamentoEntrada> consultarLancamentosEntrada(LancamentoTO lancamento) {
		if (lancamento.getLancamentoEntrada().getCliente() != null) {
			uaiCriteria.innerJoin("cliente").andEquals("cliente.id", lancamento.getLancamentoEntrada().getCliente().getId());
		}
		if (lancamento.getLancamentoEntrada().getFuncionario() != null) {
			uaiCriteria.innerJoin("funcionario").andEquals("funcionario.id", lancamento.getLancamentoEntrada().getFuncionario().getId());
		}
		if (lancamento.getLancamentoEntrada().getServico() != null) {
			uaiCriteria.innerJoin("servico").andEquals("servico.id", lancamento.getLancamentoEntrada().getServico().getId());
		}
		
		if (lancamento.getPeriodo().preenchido()) {
			uaiCriteria.andBetween("dataLancamento", lancamento.getPeriodo().getDataInicio(), lancamento.getPeriodo().getDataFim());
		}
		return uaiCriteria.getResultList();
	}
	
	public List<LancamentoEntrada> consultarLancamentosEntrada(Funcionario funcionario, Periodo periodo) {
		uaiCriteria.innerJoin("funcionario").andEquals("funcionario.id", funcionario.getId());
		uaiCriteria.andBetween("dataLancamento", periodo.getDataInicio(), periodo.getDataFim());
		return uaiCriteria.getResultList();
	}

}
