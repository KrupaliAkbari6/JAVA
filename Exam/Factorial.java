// Write a program user through input one number and perform Factorial Using Constructor.

import java.util.*;
class One
{
	Scanner sc=new Scanner(System.in);
	int fact=1;
	int no;
	One()
	{
		System.out.print("Enter the number : ");
		no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number "+no+ " is : " + fact);
	}
}

class Factorial
{
	public static void main(String[] args) 
	{
		One o=new One();
	}
}
