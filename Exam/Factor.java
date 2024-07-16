//Write a program user through input one number and perform Factor Using Constructor.

import java.util.*;
class One
{	
	Scanner sc=new Scanner(System.in);
	int no;
	One()
	{
		System.out.print("Enter the number : ");
		no=sc.nextInt();
		System.out.println("Factor of number " + no + " is : ");
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				System.out.print(i + " ");
			}
		}
	}
}

class Factor
{
	public static void main(String[] args) 
	{
		One o=new One();
	}
}