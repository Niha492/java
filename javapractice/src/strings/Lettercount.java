package strings;

public class Lettercount {
		  public static void main(String args[]) 
		  {
		      
		  String input = "how are you now it is afternoon eat apple";
		  char search = 'a';             // Character to search is 'a'.
		  
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == search)
		      count++;
		  }
		  
		  System.out.println("The Character '"+search+"' appears "+count+" times.");
		  }
		}
