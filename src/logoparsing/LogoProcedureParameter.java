package logoparsing;

public class LogoProcedureParameter {
	private String nomParam;
	//private double valeurParam;
	
	public String getNom() {
		return nomParam;
	}
	public void setNom(String nom) {
		this.nomParam = nom;
	}
	
	/*public double getValeur() {
		return valeurParam;
	}
	public void setValeur(double valeur) {
		this.valeurParam = valeur;
	}*/
	
	public LogoProcedureParameter(String nomParam, double valeur){
		this.nomParam = nomParam;
		//this.valeurParam = valeur;
	}
}
