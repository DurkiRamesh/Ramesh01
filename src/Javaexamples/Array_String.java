package Javaexamples;

public class Array_String {
	public static void main(String args[]) {
		String s[]=new String[3];
		s[0]="welcome";
		s[1]="to";
		s[2]="training";
		System.out.println(s.length);//return length of array
		for(String i:s)
		{
			System.out.println(i);
		}
	}

}
