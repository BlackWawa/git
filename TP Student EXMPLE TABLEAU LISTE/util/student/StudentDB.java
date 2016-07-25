package student;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentDB {

	private List<Student> list = new ArrayList<>();

	public StudentDB() {
		// Student a = new Student("Henry", "DELATOUR", "@gmail");
		list.add(new Student("Henry", "YGJRJ", "@gmail"));
		list.add(new Student("Herte", "RTJRTJ", "@gmail"));
		list.add(new Student("Hgdht", "RTJRTJ", "@gmail"));
		list.add(new Student("zerzyry", "DFGFG", "@gmail"));
		list.add(new Student("Heyey", "DFHDFH", "@gmail"));
		list.add(new Student("eyehzs", "DFHDFH", "@gmail"));
		list.add(new Student("yipytrgh", "DFHDFH", "@gmail"));
		list.add(new Student("zoet", "DFHDFHKYU", "@gmail"));

	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

}
