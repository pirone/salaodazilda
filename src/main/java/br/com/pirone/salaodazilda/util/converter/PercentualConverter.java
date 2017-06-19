package br.com.pirone.salaodazilda.util.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("percentualConverter")
public class PercentualConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		value = value.replace(",", ".").replace("%", "");
		Double valor = new Double(value);
		return valor;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String valor = value.toString();
		valor = valor.replace(".", ",");
		return valor;
	}

}
