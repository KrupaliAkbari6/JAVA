import java.util.*;

class Perform
{
	Scanner sc=new Scanner(System.in);
	int size;
	Perform()
	{
		System.out.println("Enter the Size of array : ");
		size=sc.nextInt();

		int arr[]=new int[size+1];
		System.out.println("Enter "+size+" Integer :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the Inserted Elemnet :");
		int insert=sc.nextInt();

		System.out.println("Enter the Position :");
		int pos=sc.nextInt();

		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			if(i+1==pos)
			{
				for(int j=size;j>i;j--)
				{
					arr[j]=arr[j-1];
				}
				arr[i]=insert;
				flag=true;
				size++;
				break;
			}
		}
		if(flag)
		{
			for(int i=0;i<size;i++)
				System.out.print(arr[i]+" ");
		}
		else
		{
			System.out.print("Position Invalid");
		}		

	}
}


class Arr_insert
{
	public static void main(String[] args) 
	{
		Perform p=new Perform();
	}
}
