import java.lang.*;
import java.util.*;
class Test
{
	public static void main(String args[])
	{
		int n,count=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(i=1;i<n/2;i++)
		{
			if(n%i==0)
			count++;
		}
		if(count==2)
			System.out.println("prime number");
		else
			System.out.println("not a prime number");
	}
}
