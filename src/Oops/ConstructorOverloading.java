package Oops;

public class ConstructorOverloading {
	int a=0;
	int b=0;
	double c=0;
	ConstructorOverloading()    //1st	
	{
	a=10;
	b=20;
	c=20.5;
	
	}
	ConstructorOverloading(int x,int y)  //2nd
	{
		a=x;
		b=y;
	}
	ConstructorOverloading(int x,int z)  //3rd
	{
	a=x;
	c=y;
	}
	ConstructorOverloading(int x,int y,double z)//4th
	{
		a=x;
		b=y;
		c=z;
	}
	ConstructerOverloading(int x,double y,int z)//5th
	{ 
		a=x;
		b=z;
		c=y;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	
public static void main(String args[]) {
	ConstructorOverloading co=new ConstructorOverloading();
	ConstructorOverloading co=new ConstructorOverloading(10,20);
	ConstructorOverloading co=new ConstructorOverloading(10,20.5);
	ConstructorOverloading co=new ConstructorOverloading(10,20,20.5);
	co.display();
}
}
