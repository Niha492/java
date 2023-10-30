package keywords;

public class Static {
	static int a=100;
	int b=25;
	public static void show()
	{
		System.out.println("hello everyone");
	}
public void display()
{
System.out.println("hi everyone");	
}
public static void main(String[] args) {
	System.out.println(a);
	Static c=new Static();          // object creation
	
	c.b();                        //
	c.display();                  // non static can call through an object
	show();                      //static variable can call directly
}
private void b() {
	System.out.println(b);
}
}
