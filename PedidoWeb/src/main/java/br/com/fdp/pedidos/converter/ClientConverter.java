package br.com.fdp.pedidos.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fdp.pedidos.model.Client;
import br.com.fdp.pedidos.model.State;
import br.com.fdp.pedidos.repository.ClientRepository;



@Component
public class ClientConverter implements Converter{
	
	@Autowired
	private ClientRepository clientRepository;

	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value.isEmpty())
			return null;
		try {
			Client client = clientRepository.findOne(new Long(value));
			return client;
		} catch (Exception e) {
			return null;
		}
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof State) {
			Client client = (Client) value;
			return client.getId().toString();
		} else {
			return null;
		}
	}

}
