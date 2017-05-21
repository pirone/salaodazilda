package br.com.pirone.salaodazilda.web.cliente.consultar;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.common.GrowlMessages;
import br.com.pirone.salaodazilda.domain.Servico;

@Named
@RequestScoped
public class ConsultarClienteController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ConsultarClienteView consultarClienteView;


	@Inject
	private GrowlMessages growl;


	public ConsultarClienteView getConsultarClienteView() {
		return consultarClienteView;
	}

	public void setConsultarClienteView(ConsultarClienteView consultarClienteView) {
		this.consultarClienteView = consultarClienteView;
	}

	public void consultar() {
		
	}

	public void inativar(Servico servico) {
		
		growl.exclusaoSucesso();
	}

}
