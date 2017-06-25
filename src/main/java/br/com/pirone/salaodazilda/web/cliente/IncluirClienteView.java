package br.com.pirone.salaodazilda.web.cliente;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.Cliente;

@Named
@SessionScoped
public class IncluirClienteView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Cliente clienteInclusao;

	public Cliente getClienteInclusao() {
		return clienteInclusao;
	}

	public void setClienteInclusao(Cliente clienteInclusao) {
		this.clienteInclusao = clienteInclusao;
	}
	
	

}

