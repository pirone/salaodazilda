package br.com.pirone.salaodazilda.util.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("dateConverter")
public class DateConverter implements Converter {
	
	private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date date;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		try {
			date = formatter.parse(value);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return formatter.format(value);
	}

}
