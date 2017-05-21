package br.com.pirone.salaodazilda.web.cliente.consultar;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.pirone.salaodazilda.domain.Cliente;

@Named
@ViewScoped
public class ConsultarClienteView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Cliente clienteConsulta;
	
	private List<Cliente> resultado;

	public Cliente getClienteConsulta() {
		return clienteConsulta;
	}

	public void setClienteConsulta(Cliente clienteConsulta) {
		this.clienteConsulta = clienteConsulta;
	}

	public List<Cliente> getResultado() {
		return resultado;
	}

	public void setResultado(List<Cliente> listaClientes) {
		this.resultado = listaClientes;
	}
}
