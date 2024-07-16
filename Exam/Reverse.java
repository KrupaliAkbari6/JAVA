import java.util.*;
class Reverse
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int temp=0,rev=0,rem=0;
		System.out.print("Enter Number : ");
		int no=sc.nextInt();
		temp=no;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("Original Number is : " + no);
		System.out.println("Reverse Number is : " + rev);
	}
}