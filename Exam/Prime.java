import java.util.*;
class Prime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no : ");
		int no=sc.nextInt();
		boolean prime=true;
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
			prime=false;
		}
		if(prime)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}
}
