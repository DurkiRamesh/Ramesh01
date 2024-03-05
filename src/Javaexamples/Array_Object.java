package Javaexamples;

public class Array_Object {
public static void main(String args[]) {
 /*Object a[]=new Object[5];
 
         a[0]=10;//integer
		 a[1]=20.5;//double
		 a[2]="welcome";//string
		 a[3]='G';//char
		 a[4]=true;//boolean
		 */
 Object a[]= {100,345,678,"welcome",'B',true,300,506.66};
		 for(Object i:a)
		 {
			 System.out.println(i);
		 }
 
}
}
