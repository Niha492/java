package inheritance;

public class Tv_smart implements Electronics,Tv{

	@Override
	public void type() {
	System.out.println("Qled");
		
	}

	@Override
	public void rate() {
	System.out.println("35000");
		
	}

	@Override
	public void name() {
System.out.println("samsung");
		
	}

	public static void main(String[] args) {
	Tv_smart Tv=new Tv_smart();
Tv.rate();
Tv.type();
Tv.name();
		

	}

}
