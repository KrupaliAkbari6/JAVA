
//Write a program that a Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. For Example: 3210

import java.util.*;
class Process
{
	Scanner sc=new Scanner(System.in);
	int no,c=0;
	Process()
	{
		System.out.println("Enter the Number :");
		no=sc.nextInt();

		while(no!=0)
		{
			//int rem=no%10;
			if(no%10==0)
				c++;
				no=no/10;
		}
		if(c>0)
		{
			System.out.println( "Duck Number ");
		}
		else
		{
			System.out.println("is not Duck Number");
		}

	}
}
class Duck
{
	public static void main(String[] args) 
	{
		Process p=new Process();	
	}
}