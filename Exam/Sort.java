import java.util.*;
class Sort
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int temp=0;
		int no[]=new int[5];
		int k=1;
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Number -> " + k + ":");
			k++;
			no[i]=sc.nextInt();
		}
		System.out.println("\n -----Display Array------");
		k=1;
		for(int i=0;i<5;i++)
		{
			System.out.println("Number ->" + k + ":" + no[i]);
			k++;
		}
		System.out.println("\n ------Sorting Array---------");
		k=1;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(no[i]>no[j])
				{
					temp=no[i];
					no[i]=no[j];
					no[j]=temp;
				}
			}
			System.out.println("Number is ->" + k + ":" + no[i]);
			k++;
		}
	}
}