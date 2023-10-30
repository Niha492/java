package strings;

public class Pallindrome {
	public static void main(String[] args) {
		 String s= "madam";
		 String rev="";
		 for(int i=s.length()-1; i>=0; i--)
		 {
			 rev=rev+s.charAt(i);
		 }
		 if (s.equals(rev))
		 {
		System.out.println("string is pallindrome");
			}
	
		 else
		 {
			 System.out.println("not pallindrome");
		 }


}
}