class Employee{
	int id;
	String name;
	double salary;
	
	static double getAnnualSalary(double a)
	{return a;}
	
	static double getIncrement(double a)
	{return (2.0/100)*a;}
	
}

class TestEmployee{
	public static void main(String args[])
	{	
		Employee emp1=new Employee();
		emp1.id=101;
		emp1.name="Thor";
		emp1.salary=20000.00;
		System.out.println("The increment details of "+emp1.name+" : "+ emp1.getIncrement(emp1.salary));
		
		
		Employee emp2=new Employee();
		emp2.id=102;
		emp2.name="Loki";
		emp2.salary=15000.00;
		System.out.println("The increment details of "+emp2.name+" : "+ emp2.getIncrement(emp2.salary));
	}
	}
	
	
