package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.ClientDAO;
import metier.Client;

@ManagedBean
@SessionScoped
public class ClientController {

	private List<Client> ListClient = new ArrayList<>();

	public ClientController(List<Client> listClient) {
		super();
		ListClient = listClient;
	}

	public ClientController() {

		 ListClient.add(new Client(1, "A", "a", "a@"));
		 ListClient.add(new Client(2, "B", "b", "b@"));
		 ListClient.add(new Client(3, "C", "c", "c@"));
		 ListClient.add(new Client(4, "D", "d", "d@"));
		 ListClient.add(new Client(5, "E", "e", "e@"));
		 ListClient.add(new Client(6, "F", "f", "f@"));
		 ListClient.add(new Client(7, "G", "g", "g@"));
		 ListClient.add(new Client(8, "H", "h", "h@"));
		 ListClient.add(new Client(9, "I", "i", "i@"));
		 ListClient.add(new Client(10, "J", "j", "j@"));

	}

	public List<Client> getListClient() {
		List<Client> list = new ArrayList<>();
		try {
			list = ClientDAO.getInstance().getClients();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void setListClient(List<Client> listClient) {
		ListClient = listClient;
	}

	// public String addClient() {
	//
	// list = ClientDAO.getInstance().addCLient(Client());
	//
	// return ListClient;
	//
	// }

}
