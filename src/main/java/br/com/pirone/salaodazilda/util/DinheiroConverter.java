package br.com.pirone.salaodazilda.util;

import java.math.BigDecimal;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("dinheiroConverter")
public class DinheiroConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
	    BigDecimal valor = null;
	    if (arg2 != null) {
	        if (arg2.isEmpty() == false) {
	        	arg2 = arg2.replace(',', '.');
	            valor = new BigDecimal(arg2);
	        }
	    }
	    return valor;
	}
	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
	    return arg2.toString().replace('.', ',');
	}

}
