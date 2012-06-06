package logoparsing;

public class LogoContext {
	public static final int nbMax = 100;
	private LogoTableId[] scopePile = new LogoTableId[nbMax];
	private int top = -1;
	
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
		scopePile[top].setId(id, d);
	}
	
	public LogoContext (){
	}
	
	
}
