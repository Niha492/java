package oops;

public class Employee_id {
int empid;
String name;
int salary;
String domain;

void display()
{
System.out.println("employee id is: "+empid);
System.out.println("employee name is: "+name);
System.out.println("employee salary is: "+salary);
System.out.println("employee domain is: "+domain);
}
public static void main(String[] args) {
	Employee_id sathish=new Employee_id();
	sathish.empid=1152;
	sathish.name="kunchanapalli sathish";
	sathish.salary=75000;
	sathish.domain="testing";
	sathish.display();
	
}
}
