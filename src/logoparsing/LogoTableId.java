package logoparsing;

import java.util.HashMap;

public class LogoTableId {
	private HashMap<String, Double> table_id;
	
	public LogoTableId() {
		table_id = new HashMap<String, Double>();
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
	
	public static void main(String[] args) {
		LogoTableId t = new LogoTableId();
		
		//t.setId("a", (Double)3.5);
		//t.setId("a", (Double)4.5);
		
		System.out.println(t.getId("a"));
	}
}
