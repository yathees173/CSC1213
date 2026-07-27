public class Employee{
	private int id;
	private String name;
	private double salary;

public Employee(){
	this.id=id;
	this.name=name;
	this.salary=salary;
}

public String getName(){
	return name;
}
/*
public double getSalary(){
	return salary;
}
*/
public Employee(int id, String name, double salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
}

public double getAnnualSalary(){
	return (12*salary)+(0.02*salary*12);
}

public double getIncrement(){
	return 0.02*salary;
}

public void display(){
	System.out.println("The increment details of "+getName()+" : "+getIncrement());
	System.out.println("The Annual salary of "+getName()+" : "+getAnnualSalary());
}

}