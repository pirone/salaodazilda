package br.com.pirone.salaodazilda.web.categoriaservico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.CategoriaServico;

@Named
@SessionScoped
public class ConsultarCategoriaView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CategoriaServico categoriaConsulta = new CategoriaServico();
	
	private List<CategoriaServico> resultado;

	public CategoriaServico getCategoriaConsulta() {
		return categoriaConsulta;
	}

	public void setCategoriaConsulta(CategoriaServico categoriaConsulta) {
		this.categoriaConsulta = categoriaConsulta;
	}

	public List<CategoriaServico> getResultado() {
		return resultado;
	}

	public void setResultado(List<CategoriaServico> resultado) {
		this.resultado = resultado;
	}

}

