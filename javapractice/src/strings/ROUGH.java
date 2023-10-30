package strings;

public class ROUGH {

//public class Reversestring {
  public static void main(String[] args) {
    String originalStr = "Marolix Technology";
    String reversedStr = "";
    System.out.println("Original string: " + originalStr);
        
    for (int i = 0; i < originalStr.length(); i++) {
      reversedStr = originalStr.charAt(i) + reversedStr;
    }
    
    System.out.println("Reversed string: "+ reversedStr);
  }



//OUTPUT:
//Original string: Marolix Technology
//Reversed string: ygolonhceT xiloraM
}
