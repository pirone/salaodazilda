package br.com.pirone.salaodazilda.web;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class BaseController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
     
    public void saveMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + message) );
        context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
    }
    
    public void enviarMensagemSucesso() {
    	FacesContext context = FacesContext.getCurrentInstance();
    	
    	context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Cadastro realizado com sucesso."));
    }
    
    public void enviarMensagemErro() {
    	FacesContext context = FacesContext.getCurrentInstance();
    	
    	context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Não foi possível realizar a operação."));
    }
    
    public void enviarMensagemErro(String mensagem) {
    	FacesContext context = FacesContext.getCurrentInstance();
    	
    	context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", mensagem));
    }
}
