package br.com.pirone.salaodazilda.common;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
@ManagedBean
public class GrowlMessages {
     
    private String message;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
     
    public void inclusaoSucessoGenerico() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Oba!",  "Registro incluído com sucesso."));
    }
    
    public void inclusaoSucessoCustom() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Oba!",  message + " incluído com sucesso."));
    }
}
