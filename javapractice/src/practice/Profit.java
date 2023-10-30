package practice;
import java.util.Scanner;

public class Profit {
		public class Scanner_class {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Selling price\n");
	int cp=scan.nextInt();
	System.out.println("Enter cost price\n");
	int sp=scan.nextInt();
	scan.close();
	if(cp-sp<0)
	{
		System.out.println("Loss");
	}
	 else if(cp-sp>0)
	{
		System.out.println("profit");
	}
	 else
	 {
	System.out.println("Neutral");
	
	 }
	}

}
}