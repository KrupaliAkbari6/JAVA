import java.util.*;
class Menu
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("--------------");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Divition");
			System.out.println("5.Exit");
			System.out.println("--------------");
			System.out.println("Enter above number : ");
			int no=sc.nextInt();
			System.out.println("---------------");

			switch(no)
			{
			  case 1:
			  	System.out.println("Addition");
			  	System.out.println("-----------");
			  	System.out.print("Enter no1 : ");
			  	int no1=sc.nextInt();
			  	System.out.print("Enter no2 : ");
			  	int no2=sc.nextInt();
			  	System.out.print("Addition is : "+(no1+no2));
			  	System.out.println("\n");
				break;

			  case 2:
			  	System.out.println("Subtraction");
			  	System.out.println("-----------");
			  	System.out.print("Enter no3 : ");
			  	int no3=sc.nextInt();
			  	System.out.print("Enter no4 : ");
			  	int no4=sc.nextInt();
			  	System.out.print("Subtraction is : "+(no3-no4));
			  	System.out.println("\n");
				break;

				case 3:
			  	System.out.println("Multiplication");
			  	System.out.println("-----------");
			  	System.out.print("Enter no5 : ");
			  	int no5=sc.nextInt();
			  	System.out.print("Enter no6 : ");
			  	int no6=sc.nextInt();
			  	System.out.print("Multiplication is : "+(no5*no6));
			  	System.out.println("\n");
				break;

				case 4:
			  	System.out.println("Division");
			  	System.out.println("-----------");
			  	System.out.print("Enter no7 : ");
			  	int no7=sc.nextInt();
			  	System.out.print("Enter no8 : ");
			  	int no8=sc.nextInt();
			  	System.out.print("Divition is : "+(no7/no8));
			  	System.out.println("\n");
				break;
				
			  case 5:
				System.exit(0);

			  default :
				System.out.println("plz Enter above menu"); 



			}

		}
	}
}