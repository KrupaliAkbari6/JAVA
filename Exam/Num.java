//3. Write a program that takes three numbers and checks and then prints the greatest number
//----------using turnery opretor----------
/*import java.util.*;  
public class Num  
{  
public static void main(String[] args)   
{  
int a, b, c, largest, temp;  
//object of the Scanner class  
Scanner sc = new Scanner(System.in);  
//reading input from the user  
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();  
//comparing a and b and storing the largest number in a temp variable  
temp=a>b?a:b;  
//comparing the temp variable with c and storing the result in the variable  
largest=c>temp?c:temp;  
//prints the largest number  
System.out.println("The largest number is: "+largest);  
}  
}  */


//nested if

import java.util.*;

class Num
{
	public static void main(String[] args) 
	{
		//int a=10;
		//int b=20;
		//int c=30;

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no1:");
		int a=sc.nextInt();
		System.out.print("Enter no2:");
		int b=sc.nextInt();
		System.out.print("Enter no3:");
		int c=sc.nextInt();
		System.out.print("\n");

		if(a>=b)
		{
			if(a>=c)
			{
				System.out.println("A is Greatest");
			}
			else
			{
				System.out.println("C is Greatest");
			}
		}
		else
		{
			if(b>=c)
			{
				System.out.println("B is Greatest");
			}
			else {
				System.out.println("C is Greatest");
			}
		}
	}
}

