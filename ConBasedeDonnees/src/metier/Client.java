package metier;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Client {

	private int id;
	private String nom;
	private String prenom;
	private String ville;

	public Client(int string, String nom, String prenom, String ville) {
		super();
		this.id = string;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;

	}

	public Client() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
