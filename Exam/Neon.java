//Write a program user through input one number and then check this number is neon or not. Using Constructor.

import java.util.*;
class One
{
	Scanner sc=new Scanner(System.in);
	int num;
	One()
	{
		System.out.print("Enter the Number :");
		num = sc.nextInt();
		int square=num*num;
		System.out.println("Square of Number is : " + square );
		int sum=0;
		int temp=square;
		while(temp!=0)
		{
			int digit=temp%10;
			sum=sum+digit;
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println(square + " is Neon Number");
		}
		else
		{
			System.out.println(square + " is Not Neon Number");
		}

	}
}

class Neon
{
	public static void main(String[] args) 
	{
		One o=new One();	
	}
}