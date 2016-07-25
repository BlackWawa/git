package controller;

public class Clients {

	private String name;
	private String password;

	public Clients(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public Clients() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
