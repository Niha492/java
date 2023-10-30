package strings;
import java.util.Scanner;

public class Wordcount {

	public static void main(String[] args) {
		//String s="love coding java";
		int count=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String s= sc.nextLine();
		sc.close();
		for(int i=0; i<s.length(); i++)
		{

			if(s.charAt(i)==' ')
			{
				System.out.println(s);
				count=count+1;			
			}
					
		}
		System.out.println(count);
			}
		
}
