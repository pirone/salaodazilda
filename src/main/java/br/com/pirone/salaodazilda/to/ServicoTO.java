package br.com.pirone.salaodazilda.to;

import java.util.List;

import br.com.pirone.salaodazilda.domain.CategoriaServico;
import br.com.pirone.salaodazilda.domain.Servico;

public class ServicoTO {
	
	private Servico servico;
	private List<CategoriaServico> categorias;
	
	public Servico getServico() {
		if (servico == null) {
			servico = new Servico();
		}
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public List<CategoriaServico> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<CategoriaServico> categorias) {
		this.categorias = categorias;
	}

}
