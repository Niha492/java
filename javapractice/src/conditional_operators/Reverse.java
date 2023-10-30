package conditional_operators;

public class Reverse {

	public static void main(String[] args) {
		int num=539,rem,rev=0;
		do {
			rem=num%10;
			num=num/10;
			rev=(rev*10) +rem;
		}
while (num>0) ;

	System.out.println("Reverse of the number is: "+rev);
}
	

}
