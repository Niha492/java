package polymorphism;

public class Employee1 {
		int empidnumber;
		String name;
		public Employee1(int id, String names)
		{
			empidnumber=id;
			name=names;
		}
		public static void main(String[] args)
		{
			Employee1 emp=new Employee1(150,"niharika");
			Employee1 emp2=new Employee1(151,"keerthi");
			System.out.println(emp.empidnumber+" "+emp.name);
			System.out.println(emp2.empidnumber+" "+emp2.name);
			
		}

	}



