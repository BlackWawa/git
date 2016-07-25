package student;

public class Film {

	private String titre;
	private String date;

	public Film(String titre, String date) {
		super();
		this.titre = titre;
		this.date = date;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}