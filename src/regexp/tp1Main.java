package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class tp1Main {

	public static void Q1() {
		
		// Question 1
//		String patternString = "0|(-?[1-9]\\d*)";
//		String text = "-12381AAAAe283-23";
		
		// Question 2
//		String patternString = "(-?0|(-?[1-9]\\d*))\\.\\d*[1-9]+\\d*";
//		String text = "-0.000345zze0.00qdfq0.345";
		
		// Question 3
//		String patternString = "(00|\\+)33-\\d{5}-\\d{4}";
//		String text = "00-33344234485";
		
		// Question 4
//		String patternString = "(-?0|(-?[1-9]\\d*))\\.?\\d*[1-9]+\\d*e-?\\d*[1-9]+\\d*";
//		String text = "-2.6e-300aa-2603e-30azc-2.6e-00";
		
		// Question 5
		// debut de chaine et d�but de mot
//		String patternString = "\\w+le\\w+";
//		String text = "parlement epaule paralelle lente lelele";
		
		// Question 6
//		String patternString = "\\B(\\d+)\\w+";
//		String text = "Ax25By qsdone767dioq qsZION3749qdz 12345 ";
		
		// Question 7
//		String patternString = "\\{\\s*\\\"\\w+\\\"\\s*:\\s*\\[(\\d+),(\\d+)\\]\\s*\\}";
//		String text = "{          \"args\"      : [10,20]       }";

		// Question 8
		String patternString = "\\{ \\\"\\w+\\\" : \\[(\\d+),(\\d+)\\]\\}";
		String text = "{ \"args\" : [10,20]}";
		
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);
		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text);
		//boolean found = m.find();
		boolean f;
		while (f = m.find()) {
			System.out.println("==========================================");
			System.out.println("Succ�s : " + f);
			//System.out.println("Position d�but : " + m.start());
			//System.out.println("Avant : " + text.substring(0,m.start()));
			System.out.println("S�lection : " + m.group(1));
			//System.out.println("Groupe : " + m.group(1));
			//System.out.println("Position fin : " + m.end());
			//System.out.println("Apr�s : " + text.substring(m.end()));
		}
	}
	public static void main(String[] args) {
		Q1();
	}
}
