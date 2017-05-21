package br.com.pirone.salaodazilda.common;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
 
@Named
@RequestScoped
public class GrowlMessages {
     
    private String message;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }

	private void conteudoModal(String titulo, String descricao) {
		FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(titulo, descricao ));
	}
     
    public void inclusaoSucessoGenerico() {
        conteudoModal("Incluído com sucesso!","Registro incluído com sucesso.");
    }

  
    public void inclusaoSucessoCustom() {
        conteudoModal("", "");
    }
    
    public void exclusaoSucesso() {
    	conteudoModal("Excluído com sucesso", "");
    }
}
