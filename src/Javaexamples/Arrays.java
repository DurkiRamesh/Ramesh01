package Javaexamples;

public class Arrays {
	public static void main(String args[]) {
   int a[]=new int[10];//declaration of array with 10elements
   //store elements into array
   a[0]=10;
   a[1]=20;
   a[2]=30;
   a[3]=40;
   a[4]=50;
   //read elements from an array
   /*for(int i=0;i<=4;i++)
   {
   System.out.println(a[i]);
   }*/
   //for each...loop
   for(int i:a)
   {
	   System.out.println(i);
   }

	}
  
}

