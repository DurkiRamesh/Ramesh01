package Oops;

public class Employee {
  int empid;
  String empname;
  int salary;
  int deptno;
  
 /* Employee(int id,String name,int sal,int dno)
  {
	  empid=id;
	  empname=name;
	  salary=sal;
	  deptno=dno;
}*/
  void setdata(int id,String name,int sal,int dno)
  {
   empid=id;
  empname=name;
  salary=sal;
  deptno=dno;
  }
	  
	  void display()
	  
	  {
	  System.out.println(empid);
	  System.out.println(empname);
	  System.out.println(salary);
	  System.out.println(deptno);
  }
  public static void main(String args[])
  {
	  //Assigning values to class variables using object- first method
	/*  Employee emp1=new Employee();//first employee
	 emp1.empid=101;
	  emp1.empname="Ramesh";
	  emp1.salary=20000;
	  emp1.deptno=10;
	  emp1.display();*/
	  //Assigning vaues to class variables using constructer 
	  
	 /* Employee emp1=new Employee(101,"Ramesh",20000,10);
	  emp1.display();*/
	 /* Employee emp2=new Employee();//second Employee
		 emp1.empid=101;
		  emp1.empname="Raju";
		  emp1.salary=30000;
		  emp1.deptno=20;
		  emp1.display();*/
	  
	  //Assigning vaues to class variables using constructer 
	   
	/*  Employee emp2=new Employee(101,"Raju",30000,20);
	  emp2.display();*/
	 // Assigning values to class variables using- 3rdmethod
	  Employee emp1=new Employee();
	  emp1.setdata(101,"Ramesh",20000, 10);
		emp1.display();  
		Employee emp2=new Employee();
		  emp2.setdata(101,"Raju",30000, 20);
			emp2.display();  
		
  }
  

}
