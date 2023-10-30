package conditional_operators;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=539;
		int rem;
		int rev=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*0+rem;
			System.out.print(rev);
		}
		}
	
}
