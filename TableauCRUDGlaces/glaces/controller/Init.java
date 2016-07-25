package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.DaoGlace;
import metier.MetierGlace;

@ManagedBean
public class Init {

	private List<MetierGlace> gl = new ArrayList<>();
	private List<MetierGlace> glaceBD1 = new ArrayList<>();
	
	public Init(){
		gl.add(new MetierGlace(1,"Double Cornet",2,"vanille"));
		gl.add(new MetierGlace(2,"Simple Cornet",1,"menthe"));
		gl.add(new MetierGlace(3,"Triple Cornet",3,"chocolat"));
		gl.add(new MetierGlace(4,"Double Cornet",2,"fraise"));
		gl.add(new MetierGlace(5,"Triple Cornet",3,"framboise"));
		gl.add(new MetierGlace(6,"Double Cornet",2,"pistache"));
		gl.add(new MetierGlace(7,"Simple Cornet",1,"caramel"));
		gl.add(new MetierGlace(8,"Simple Cornet",1,"citron"));
	}

	public List<MetierGlace> getGl() {
		System.out.println(gl.toString());
		return gl;
		
	}

	public void setGl(List<MetierGlace> gl) {
		this.gl = gl;
	}
	
	public  List<MetierGlace> getBD1(){
		DaoGlace glaceBD = new DaoGlace();
		glaceBD1 =glaceBD.getGlace();
		return glaceBD1;
		
		
	}
	
	
	
}
