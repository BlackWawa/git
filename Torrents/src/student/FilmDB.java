package student;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FilmDB {

	private List<Film> list = new ArrayList<>();

	public FilmDB() {

		list.add(new Film("Titanic", "1999"));
		list.add(new Film("Le renard", "2016"));
		list.add(new Film("L'hermite", "1987"));
		list.add(new Film("Bernard et Bianca", "1400"));
		list.add(new Film("Interstellar", "2012"));
		list.add(new Film("Inception", "2010"));
		list.add(new Film("Man of Steel", "2003"));
		list.add(new Film("Jump around !", "2007"));

	}

	public List<Film> getList() {
		return list;
	}

	public void setList(List<Film> list) {
		this.list = list;
	}

}
