package conditional_operators;

public class Switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'H';
		switch(grade)
		{
		case'A':System.out.println("Excellent");break;
		case'B':System.out.println("Outstanding");break;
		case'C':System.out.println("Very good");break;
		case'D':System.out.println("Good");break;
		case'E':System.out.println("Passed");break;
		case'F':System.out.println("Fail");break;
		default:System.out.println("Not Valid");break;
		}

	}

}
