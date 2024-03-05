package Javaexamples;

public class Operators {
	public static void main(String args[] ){
		int a;
		int b;
		a=10;
		b=20;
		///Arthematic operators
       System.out.println(a+b);
       System.out.println(b-a);
       System.out.println(a*b);
       System.out.println(a/b);
       System.out.println(a%b);
       System.out.println("---------");
       //Relational operators
       System.out.println(a<b);//true
       System.out.println(a>b);//false
       System.out.println(a==b);//false
       System.out.println(a!=b);//true
       System.out.println(a<=b);//true
       System.out.println(a>=b);//false
       
       System.out.println("---------");
       //Logical operators
       boolean x=true;
       boolean y=false;
       
       System.out.println(x&&y);//false
       System.out.println(x||y); //true
       System.out.println(!x);//false
       System.out.println(!y);//true
       
       System.out.println("---------");
       //Assignment operatotrs
       int c;
       c=a;
       System.out.println(c);
       c=b;
       System.out.println(c);
       
       c=100;
       c++; //c+1; //increment operator
       c+=5;//INCREMENT BY5
       System.out.println(c);
       System.out.println("-------");
       c--; //c-1; //decrement operators
       c-=5;
       System.out.println(c);
}

}
