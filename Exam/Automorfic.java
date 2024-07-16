//Write a program user through input one number and then check. This no is AutomorphicNumber or not. Using Constructor.

import java.util.*;
class One
{
	Scanner sc=new Scanner(System.in);
	int num;
	One()
	{
		System.out.println("Enter the number : ");
		num =sc.nextInt();
		int square=num*num;
		System.out.println("Square of Number is : " + square );
		if(no%10==square%10)
		{
			System.out.print("Automorfic Number");
		}
		else
		{
			System.out.print("Not Automorfic Number");
		}

	}

}

class Automorfic
{
	public static void main(String[] args) 
	{
		One o=new One();
	}
}