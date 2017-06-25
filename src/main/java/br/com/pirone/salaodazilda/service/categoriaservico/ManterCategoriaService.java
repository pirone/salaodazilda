package br.com.pirone.salaodazilda.service.categoriaservico;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.CategoriaServico;
import br.com.pirone.salaodazilda.repository.ManterCategoriaServicoRepository;

@Named
@RequestScoped
public class ManterCategoriaService {
	
	@Inject
	ManterCategoriaServicoRepository categoriaRepository;

	public List<CategoriaServico> consultar() {
		return categoriaRepository.listarCategorias();
	}
	
	public void incluir(CategoriaServico categoria) {
		categoriaRepository.incluir(categoria);
	}
	
	public void alterar(CategoriaServico categoria) {
		categoriaRepository.alterar(categoria);
	}

}
