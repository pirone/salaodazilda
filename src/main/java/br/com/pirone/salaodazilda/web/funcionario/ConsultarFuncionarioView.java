package br.com.pirone.salaodazilda.web.funcionario;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.Funcionario;

@Named
@SessionScoped
public class ConsultarFuncionarioView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ConsultarFuncionarioView() {
		this.funcionarioConsulta = new Funcionario();
	}
	
	private Funcionario funcionarioConsulta;
	private List<Funcionario> resultado;

	public Funcionario getFuncionarioConsulta() {
		return funcionarioConsulta;
	}

	public void setFuncionarioConsulta(Funcionario funcionarioConsulta) {
		this.funcionarioConsulta = funcionarioConsulta;
	}

	public List<Funcionario> getResultado() {
		return resultado;
	}

	public void setResultado(List<Funcionario> resultado) {
		this.resultado = resultado;
	}
	
	

}
