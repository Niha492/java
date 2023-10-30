package polymorphism;

public class Methodoverloading {
	
			static int add(int a, int b)
			{
			return a+b;
			}  
			static double add(double a, double b)
			{
			return a+b;
			}  
	

			public static void main(String[] args)
			{  
			System.out.println(Methodoverloading.add(17,13));  
			System.out.println(Methodoverloading.add(10.4,10.6));
			}
			}
	

