package conditional_operators;

public class Sum_odd {

	public static void main(String[] args) {
		int i;
		int sum=0;
		for(i=730;i<=805;i++) 
		{
		if(i%2!=0)
				{
			sum=sum+i;
		}
		 	}
		System.out.println(sum);
	}

}
