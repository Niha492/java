package conditional_operators;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		int count=0;
		scan.close();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
		{
			System.out.println("Given no is prime");
		}
		else
		{
			System.out.println("Given no is not prime");
		}
		

	}

}
