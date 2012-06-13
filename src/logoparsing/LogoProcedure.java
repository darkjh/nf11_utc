package logoparsing;

import java.util.ArrayList;

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
	
	/*public boolean containsParam( String paramName){
		for (int i = 0; i < paramsList.size(); i++) {
			if (paramsList.get(i).getNom() == paramName)
				return true;
		}
		return false;
	}*/
	
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
