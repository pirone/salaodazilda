package br.com.pirone.salaodazilda.service.manterServico;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.Servico;

@Named
@RequestScoped
public interface ManterServicoService {
	
	List<Servico> consultar();

}
