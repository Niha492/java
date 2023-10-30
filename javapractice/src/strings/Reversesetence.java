package strings;
import java.util.Scanner;
public class Reversesetence {

//		public static void main(String[] args) {
//		      String str="i";
//		      String rev="";
		      
//		      for(int i=str.length()-1;i>=0;i--) {
//		    	  rev=rev+str.charAt(i);
		    	  
//		      }
//		      System.out.println(rev);
//			}
	public static void main(String[] args) {
		String input;
        String[] words;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        input = scanner.nextLine();
        scanner.close();
        words = input.split(" ");
        System.out.println("Reversed Sentence");
        for (i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

	}
	

}


