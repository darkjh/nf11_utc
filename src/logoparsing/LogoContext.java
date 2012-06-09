package logoparsing;

import java.util.HashMap;

import logogui.Log;

public class LogoContext {
	public static final int nbMax = 500;
	private LogoTableId[] scopePile = new LogoTableId[nbMax];
	private int top = -1;

	private HashMap <String,LogoProcedure> listeProcedure = new HashMap <String,LogoProcedure>();

	/*
	 * Liste procedure
	 */

	public HashMap<String, LogoProcedure> getListeProcedure() {
		return listeProcedure;
	}

	public void addProcedure(LogoProcedure p){
		listeProcedure.put(p.getNom(), p);
	}

	public LogoProcedure getProcedureByName(String name){
		return listeProcedure.get(name);
	}


	/*
	 * PILE
	 */
	@SuppressWarnings("deprecation")
	public void push(LogoTableId table){
		top ++ ;

		if (top < nbMax)
			scopePile[top]=table;
		else{
			Log.appendnl("Pile deborde...");
			//Thread.currentThread().suspend();
		}
	}

	public LogoTableId pop(){
		LogoTableId retVal = null;
		if (top < nbMax){
			retVal = scopePile[top];
			top --;
		}
		return retVal;
	}

	public boolean containsIDLocal(String id){
		return scopePile[top].checkId(id);
	}

	public boolean containsID (String id){
		for (int i = top; i >= 0; i--) {
			System.out.println("scopePile["+i+"] = "+scopePile[i]);
			if(scopePile[i].checkId(id))
				return true;
		}
		return false;
	}

	public Double getIDValue (String id){
		for (int i = top; i >= 0; i--) {
			if(scopePile[i].checkId(id))
				return scopePile[i].getId(id);
		}
		return null;
	}

	public void setIdentifier(String id, Double d){
		for (int i = top; i >= 0; i--) {
			if(scopePile[i].checkId(id)){
				scopePile[i].setId(id, d);
				return;
			}
		}
		scopePile[top].setId(id, d);
	}

	public LogoContext (){
	}
}
