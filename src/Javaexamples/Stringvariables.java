package Javaexamples;

public class Stringvariables {
	public static void main(String arfs[]) {
		String s="welcome";
	System.out.println(	s.length());//7-no.of charac
	//concatenation
	String s1="welcome";
	String s2="training";
	System.out.println(s1+s2);
	
	System.out.println(s1.concat(s2));
	
	System.out.println("welcometo"+"training");
	System.out.println("welcome".concat("training"));
	//Equals - comparing two strings
	String s3="WELCOME";
	String s4="welcome";
	System.out.println(s3.equals(s4));//false
	
	System.out.println(s3.equalsIgnoreCase(s4));//true
	
	//contains
	//s3.contains("ABC");
	System.out.println( s3.contains("xyz"));
	//subString
	System.out.println(s.substring(0, 3));
	System.out.println(s.substring(2, 5));
	System.out.println(s.substring(4, 7));
	//replays
	 System.out.println(s.replace('e', 'a'));
	
	}

}
