package Oops;

public class MethodOverloading {
int a;
int b;
void sum()//1st method
{
	a=10;
	b=20;
	System.out.println(a+b);
}
void sum(int x,int y)//2nd method
{
	int a=x;
	int b=y;
	System.out.println(a+b);
}
	void sum(int x,int y,int z)//3rd method
	{
		System.out.println(x+y+z);
	}
	void sum(int x,Double y)//4th method
	{
		System.out.println(x+y);
	}
	
	public static void main(String args[]){
		
		MethodOverloading mo=new MethodOverloading();
		mo.sum();//call  1st method
		mo.sum(100,200);//call 2nd method
		mo.sum(10,20,30);//call 3rd method
		mo.sum(10,10.5);//call 4th method
	}
}
