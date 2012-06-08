package logoparsing;

import java.util.ArrayList;
import java.util.HashMap;

public class LogoProcedure {
	private String nom;
	private int mark;
	private ArrayList< LogoProcedureParameter > paramsList ;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public int getNbParams(){
		return paramsList.size();
	}
	
	public LogoProcedureParameter getParameterByIndex(int i){
		return paramsList.get(i);
	}
	
	
	public LogoProcedure(String nom, int mk, ArrayList<LogoProcedureParameter> paramList) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.mark = mk;
		this.paramsList = paramList; 
	}
	
	
}
