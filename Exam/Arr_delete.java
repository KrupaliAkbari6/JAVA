import java.util.*;
class Delete
{
	Scanner sc=new Scanner(System.in);
	int size;
	Delete()
	{
		System.out.println("Enter the size of Array : ");
		size=sc.nextInt();

		int arr[]=new int[size];
		System.out.println("Enter "+size+" Integer");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the Element to be Deleted : ");
		int element=sc.nextInt();

		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==element)
			{
				for(int j=i;j<size-1;j++)
				{
					arr[j]=arr[j+1];
				}
				flag=true;
				size--;
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
			System.out.print("does not Deleted Element");
		}		
	}
}


class Arr_delete
{
	public static void main(String[] args) 
	{
		Delete d=new Delete();	
	}
}