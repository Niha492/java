package conditional_operators;

public class Count {

	public static void main(String[] args) {
		int i,count = 0;
for(i=1;i<=50;i++)
{
	if(i%5==0)
	{
		count=count+1;
	}
}
System.out.println(count);
	}

}
