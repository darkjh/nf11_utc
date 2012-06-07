package logoparsing;

import java.util.Hashtable;

public class LogoTableId {
	private Hashtable<String, Double> table_id;
	
	public LogoTableId() {
		table_id = new Hashtable<String, Double>();
	}
	
	public Double getId(String id) {
		if(table_id.isEmpty()) {
			return null;
		} else {
			return(table_id.get(id));
		}
	}
	
	public void setId(String id, Double d) {
		if(table_id.containsKey(id)) {
			table_id.put(id, d);
		} else {
			table_id.put(id, d);
		}
	}
	
	public boolean checkId(String id) {
		return table_id.containsKey(id);
	}
	
	/*public void affichTableId(){
		Iterator<?> iter = table_id.entrySet().iterator(); 
		while (iter.hasNext()) { 
		    Entry<String, Double> entry = (Map.Entry<String, Double>) iter.next(); 
		    Object key = entry.getKey(); 
		    Object val = entry.getValue(); 
		} 
	}*/
	
	public static void main(String[] args) {
		LogoTableId t = new LogoTableId();
		
		//t.setId("a", (Double)3.5);
		//t.setId("a", (Double)4.5);
		
		System.out.println(t.getId("a"));
	}
}
