package conditional_operators;

public class Pallindrome {

	public static void main(String[] args) {
		int num=535,rem,rev=0;
		do {
			rem=num%10;
			num=num/10;
			rev=(rev*10) +rem;
		}
while (num>0) ;
		num=535;
		if(num==rev) {
			System.out.println("The number is a palindrome");
		}
		else {
			System.out.println("The number is not a palindrome");
		}
	
}
	

}
