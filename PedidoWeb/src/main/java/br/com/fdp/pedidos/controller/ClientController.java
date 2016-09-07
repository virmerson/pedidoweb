package br.com.fdp.pedidos.controller;

import br.com.fdp.pedidos.model.Address;
import br.com.fdp.pedidos.model.Client;
import br.com.fdp.pedidos.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by guguh on 06/09/2016.
 */
@Named
@ViewScoped
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @PostConstruct
    public void init() {
        setClientList(clientRepository.findAll());
    }

    private Client client = new Client();
    private List<Client> clientList;
    private Address address = new Address();
    private boolean editMode = false;
    /**
     * Métodos
     */
    public void saveClient() {
        clientRepository.save(client);
        if (!isEditMode())
            clientList.add(client);
        client = new Client();
        setEditMode(false);
    }

    public void deleteClient(Client client) {
        clientRepository.delete(client);
    }

    public void updateClient(Client client) {
        setClient(client);
        setEditMode(true);
    }
    public void cancelEdit(){
        client = new Client();
        setEditMode(false);
    }
    public boolean showClientAddress(){
        return true;
    }


    /**
     * Getters And Setters of ClientController
     */
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public List<Client> getClientList() {
        return clientList;
    }
    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
    public boolean isEditMode() {
        return editMode;
    }
    public void setEditMode(boolean editMode) {
        this.editMode = editMode;
    }
}
