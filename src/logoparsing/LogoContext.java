package logoparsing;

public class LogoContext {
	public static final int nbMax = 100;
	private LogoTableId[] scopePile = new LogoTableId[nbMax];
	private int top = 0;
	
	public void push(LogoTableId table){
		top ++ ;
		scopePile[top]=table;
	}
	
	public LogoTableId pop(){
		LogoTableId retVal = scopePile[top];
		top --;
		return retVal;
	}
	
	public boolean containsID (String id){
		for (int i = top; i >= 0; i++) {
			if(scopePile[i].checkId(id))
				return true;
		}
		return false;
	}
	
	public Double getIDValue (String id){
		for (int i = top; i >= 0; i++) {
			if(scopePile[i].checkId(id))
				return scopePile[i].getId(id);
		}
		return null;
	}
	
	public LogoContext (){
	}
	
	
}
