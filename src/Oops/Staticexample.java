package Oops;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Staticexample {
	int a;  //non static var
	static int b; //static var
	static void m1()
	{
		System.out.println("this is m1 static method");
	}
	void m2()  //non static
	{
		System.out.println("this is m2 non static method");
	}
	void m3()//non static
	{
		a=500;//non static var
		b=1000;//non static var
		m1();
		m2();
	}
	public static void main(String args[])//static method
	{
		b=100;
		System.out.println(b);
		m1();
		//a=200; //not access.Because... non static var
		//ma();  //not accsee.Because... non static method
		
		Staticexample se=new Staticexample();
		se.a=200;
		System.out.println(se.a);
		se.m2();
	}
}
