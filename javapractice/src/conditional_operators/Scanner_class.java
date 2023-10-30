package conditional_operators;
import java.util.Scanner;
public class Scanner_class {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter first number\n");
int a=scan.nextInt();
System.out.println("Enter second number\n");
int b=scan.nextInt();
scan.close();
int add,sub,mul;
double mod;
float div;
    add=a+b;
    sub=a-b;
    mul=a*b;
    div=a/b;
    mod=a%b;
    System.out.println("Addition of two numbers: "+add);
    System.out.println("Subtraction of two numbers: "+sub);
    System.out.println("Multiplication of two numbers: "+mul);
    System.out.println("Division of two numbers: "+div);
    System.out.println("Modules of two numbers: "+mod);
	}

}
