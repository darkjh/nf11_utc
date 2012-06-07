package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamTp_p12 {
	public static void Q() {

		// Question 1
		// Utiliser trois prévisions ici, une pour hz, une pour exactement i, la dernière pour au moins un e 
		String patternString = "(?i)\\b(?![^\\s]*?[hz][^\\s]*?)(?=[^\\s]*?i[^i\\s]*?)(?=[^\\s]*e[^\\s]*)(.+?)\\b,?";
		String text = "La Gazelle, le Lion le Hibou, le Singe, le Mistigri, la Licorne";

		int comp = 0;
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);
		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text);
		boolean f;
		while (f = m.find()) {
			comp++;
			System.out.println("==========================================");
			System.out.println("Succès : " + f);
			System.out.println("Sélection : " + m.group());
		}
		
		System.out.println("Reponse: " + comp);
	}
	
	public static void main(String[] args) {
		Q();
	}
	
	
}