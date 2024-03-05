package Javaexamples;

public class TwoDimensionalArray {
public static void main(String args[]) {
	int a[][]= new int[3][2];//declaration
	//storing elements/values into array
	a[0][0]=10;
	a[0][1]=20;
	
	a[1][0]=30;
	a[1][1]=40;
	
	a[2][0]=50;
	a[2][1]=60;
	//classic for loop
	for ( int i=0;i<=2;i++)//for incrementing the rows
	{
		for(int j=0;j<=1;j++)//incre the column for each row
		{
			System.out.print(a[i][j]+"  ");//10 20 30 40
		}
	System.out.println();		
	}
}
}
