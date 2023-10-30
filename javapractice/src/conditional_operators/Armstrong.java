package conditional_operators;

public class Armstrong {

	public static void main(String[] args) {
		int num=371;
		int rem;
		int num2=0;
		int temp=num;
		while (num>0) 
		{
		rem=num%10;
		num=num/10;
		num2=(rem*rem*rem)+num2;
		}
			if(temp==num2)
			{
				System.out.println("the number is armstrong number");
			}
			else
			{
				System.out.println("number is not an armstrong number");
			}

	}

}
