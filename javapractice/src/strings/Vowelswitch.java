package strings;
import java.util.Scanner;
public class Vowelswitch {
	

		public static void main(String args[]) {
			 Scanner vowel = new Scanner(System.in);
		        System.out.println("Enter Character: ");
		        char a = (vowel.nextLine()).charAt(0);
		        char b = Character.toUpperCase(a); // Changing Value to UpperCase for uniformity.
vowel.close();
		        switch (b) { // Checking Vowel Character using Switch Case
		            case 'A':
		            case 'E':
		            case 'I':
		            case 'O':
		            case 'U':
		                System.out.println(a + " is a Vowel.");
		                break;

		            default:
		                System.out.println(a + " is a consonant.");
		    }
		}
	}

	

