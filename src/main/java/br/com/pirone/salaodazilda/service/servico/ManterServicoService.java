package br.com.pirone.salaodazilda.service.servico;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.Servico;
import br.com.pirone.salaodazilda.repository.ManterServicoRepository;

@Named
@RequestScoped
public class ManterServicoService {
	
	@Inject
	ManterServicoRepository servicoRepository;

	public List<Servico> consultar(Servico servico) {
		return servicoRepository.consultarServicos(servico);
	}
	
	public void inativar(Servico servico) {
		servicoRepository.inativar(servico);
	}
	
	public void incluir(Servico servico) {
		servicoRepository.incluir(servico);
	}
	
	public void alterar(Servico servico) {
		servicoRepository.alterar(servico);
	}

}
