package conditional_operators;

public class Sum_num {
public static void main(String[] args) {
int i;
int sum=0;
for(i=1;i<=20;i++) 
{
if(i%2==0)	
{
	sum=sum+i;
}
 	}
System.out.println(sum);
}
}
