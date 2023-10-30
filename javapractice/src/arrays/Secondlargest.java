package arrays;
//import java.util.Arrays;
public class Secondlargest {
	public class SecondHighestInArray {
	    public static void main(String[] args) {
	        int[] array = {10, 25, 48, 59, 47};
	        int secondHighest = findSecondHighest(array);
	        
	        System.out.println("Second highest element: " + secondHighest);
	    }
	    
	    public static int findSecondHighest(int[] array) {
	        int highest = Integer.MIN_VALUE;
	        int secondHighest = Integer.MIN_VALUE;
	        
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] > highest) {
	                secondHighest = highest;
	                highest = array[i];
	            } else if (array[i] > secondHighest && array[i] != highest) {
	                secondHighest = array[i];
	            }
	        }
	        
	        return secondHighest;
	    }
	}
}
	
	





