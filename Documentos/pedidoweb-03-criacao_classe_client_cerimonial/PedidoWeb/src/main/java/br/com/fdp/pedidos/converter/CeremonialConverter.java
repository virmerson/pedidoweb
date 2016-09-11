package br.com.fdp.pedidos.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fdp.pedidos.model.Ceremonial;
import br.com.fdp.pedidos.repository.CeremonialRepository;



@Component
public class CeremonialConverter implements Converter{
	
	@Autowired
	private CeremonialRepository ceremonialRepository;

	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value.isEmpty())
			return null;
		try {
			Ceremonial ceremonial = ceremonialRepository.findOne(new Long(value));
			return ceremonial;
		} catch (Exception e) {
			return null;
		}
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof Ceremonial) {
			Ceremonial ceremonial = (Ceremonial) value;
			return ceremonial.getId().toString();
		} else {
			return null;
		}
	}

}
