package inheritence;

class Bank
{
	int getRateofintrest()
	{
		return 0;
	}
	
}
	class SBI extends Bank
	{
	int getRateofintrest()	//overriden
	
	{
		return 10;
		
	}
	}
	class ICICI extends Bank
	{
	 int getRateofintrest()	//overriden
	{
		return 15;
	}
	}
	class AXIS extends Bank
	{
	int	getRateofintrest()//overriden
		{
			return 12;
		}
	
	
	}
	
public class Over_Riding {
	public static void main(String args[])
	{
		 SBI sbiobj=new SBI();
		 System.out.println( sbiobj.getRateofintrest());//10
		 
		 ICICI iciciobj=new ICICI();
		 System.out.println( iciciobj.getRateofintrest());//15
		 
		 AXIS axisobj=new AXIS();
		 System.out.println( axisobj.getRateofintrest());//12
		 
	}
}
	
	

	


