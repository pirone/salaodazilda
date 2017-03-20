package br.com.pirone.salaodazilda.service.manterServico;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.pirone.salaodazilda.domain.Servico;
import br.com.pirone.salaodazilda.repository.ManterServicoRepository;

@Stateless
public class ManterServicoServiceImpl implements ManterServicoService {
	
	@Inject
	ManterServicoRepository servicoRepository;

	@Override
	public List<Servico> consultar() {
		return servicoRepository.consultarServicos();
	}

}