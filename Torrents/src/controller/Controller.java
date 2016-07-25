package controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Controller {

	Login l = new Login();
	Clients c = new Clients();
	
	public String login(){
		//Pas le temps de faire la comparaison Login / Clients ...
		
		return "accueil";
	}
	
	
	
	
}
