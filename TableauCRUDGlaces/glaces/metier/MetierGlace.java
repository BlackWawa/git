package metier;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="glace")
public class MetierGlace {

	private int id;
	private String typeCornet;
	private int nbBoules;
	private String parfum;

	public MetierGlace(int id, String typeCornet, int nbBoules, String parfum) {
		super();
		this.id = id;
		this.typeCornet = typeCornet;
		this.nbBoules = nbBoules;
		this.parfum = parfum;
	}

	public MetierGlace() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeCornet() {
		return typeCornet;
	}

	public void setTypeCornet(String typeCornet) {
		this.typeCornet = typeCornet;
	}

	public int getNbBoules() {
		return nbBoules;
	}

	public void setNbBoules(int nbBoules) {
		this.nbBoules = nbBoules;
	}

	public String getParfum() {
		return parfum;
	}

	public void setParfum(String parfum) {
		this.parfum = parfum;
	}

}
