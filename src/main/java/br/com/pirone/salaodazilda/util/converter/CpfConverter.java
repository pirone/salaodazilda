package br.com.pirone.salaodazilda.util.converter;

import java.text.ParseException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.pirone.salaodazilda.util.MascaraUtil;

@FacesConverter("cpfConverter")

public class CpfConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		value = value.replace(".", "").replace("-", "").replace("_", "");
		return value;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String cpf = value.toString();
		
		if (!cpf.isEmpty())
		try {
			cpf = MascaraUtil.formatarString(value.toString(), "###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return cpf;
	}

}
