package br.com.fdp.pedidos.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fdp.pedidos.model.State;
import br.com.fdp.pedidos.repository.StateRepository;



@Component
public class StateConverter implements Converter{
	
	@Autowired
	private StateRepository stateRepository;

	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value.isEmpty())
			return null;
		try {
			State state = stateRepository.findOne(new Long(value));
			return state;
		} catch (Exception e) {
			return null;
		}
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof State) {
			State state = (State) value;
			return state.getId().toString();
		} else {
			return null;
		}
	}

}
