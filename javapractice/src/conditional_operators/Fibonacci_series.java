package conditional_operators;

public class Fibonacci_series {

	public static void main(String[] args) {
		int n = 10; // Change this value to set the number of Fibonacci numbers to print

        // First two numbers of the Fibonacci series
        int firstNum = 0;
        int secondNum = 1;

        System.out.println("Fibonacci Series:");

        // Print the first two numbers
        System.out.print(firstNum + " " + secondNum);

        // Generate and print the remaining Fibonacci numbers
        for (int i = 2; i < n; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(" " + nextNum);
            firstNum = secondNum;
            secondNum = nextNum;

	}

}
}