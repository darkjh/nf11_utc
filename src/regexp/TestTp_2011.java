package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTp_2011 {
	// Test for Week A
	public static void Q_A() {
		
		// Question 1
//		String patternString = "(?=\\b\\w*[Aa]\\w*\\b)(\\b([aeiou])[^\\s]*?\\2\\b)"; //
//		String text = "Il attira l'ara et il aima l'immeubli a un etage";

		// Question 2
		String patternString = "([^\\s]*?([aeiou]{2})\\w(?!\\2)[aeiou]{2}[^\\s]*?\\b)"; //
		String text = "toulouse caen beauvais couloir faisait soudeur";
		
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);
		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text);
		//boolean found = m.find();
		boolean f;
		while (f = m.find()) {
			System.out.println("==========================================");
			System.out.println("Succès : " + f);
			//System.out.println("Position début : " + m.start());
			//System.out.println("Avant : " + text.substring(0,m.start()));
			System.out.println("Sélection : " + m.group());
			//System.out.println("Groupe : " + m.group(1));
			//System.out.println("Position fin : " + m.end());
			//System.out.println("Après : " + text.substring(m.end()));
		}
	}
	public static void main(String[] args) {
		Q_A();
	}
}
