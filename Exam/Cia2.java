// //Duck Number
//  import java.util.*;
//  class Duck
//  {
//  	Scanner sc=new Scanner(System.in);
//  	int c=0;
//  	Duck()
//  	{
//  		System.out.println("Enter the number : ");
//  		int no=sc.nextInt();

//  		while(no!=0)
//  		{
//  			if(no%10==0)
//  				c++;
//  				no=no/10;
//  		}
//  		if(c>0)
//  		{
//  			System.out.println("Duck Number");
//  		}
// 		else
//  		{
//  			System.out.println("Not Duck Number");
//  		}
//  	}
//  }

//  class Cia2
//  {
//  	public static void main(String[] args) 
//  	{
//  		Duck d=new Duck();
//  	}
//  }

//Buzz Number

// import java.util.*;

// class Buzz
// {
// 	Scanner sc=new Scanner(System.in);

// 	Buzz()
// 	{
// 		System.out.println("Enter the Number : ");
// 		int no=sc.nextInt();

// 		if(no%10==7 || no%7==0)
// 		{
// 			System.out.println("Buzz Number ");

// 		}
// 		else
// 		{
// 			System.out.println("Not Buzz Number");
// 		}
// 	}
// }
// class Cia2
// {
// 	public static void main(String[] args) 
// 	{
// 		Buzz b=new Buzz();	
// 	}
// }


//Insert element

// import java.util.*;
// class Perform
// {
// 	Scanner sc=new Scanner(System.in);
// 	Perform()
// 	{
// 		System.out.println("Enter the size of array :");
// 		int size=sc.nextInt();

// 		int arr[]=new int[size+1];
// 		System.out.println("Enter "+size+" Integer :");
// 		for(int i=0;i<size;i++)
// 		{
// 			arr[i]=sc.nextInt();
// 		}

// 		System.out.println("Enter the inserted element :");
// 		int element=sc.nextInt();

// 		System.out.println("Enter the Position :");
// 		int pos=sc.nextInt();

// 		boolean flag=false;
// 		for(int i=0;i<size;i++)
// 		{
// 			if(i+1==pos)
// 			{
// 				for(int j=size;j>i;j--)
// 				{
// 					arr[j]=arr[j-1];
// 				}
// 				arr[i]=element;
// 				flag=true;
// 				size++;
// 				break;
// 			}

// 		}
// 		if(flag)
// 		{
// 			for(int i=0;i<size;i++)
// 			{
// 				System.out.print(arr[i]+" ");
// 			}
// 		}
// 		else
// 		{
// 			System.out.println("Invalid Position");
// 		}



// 	}
// }

// class Cia2
// {
// 	public static void main(String[] args) 
// 	{
// 	 Perform p=new Perform();	
// 	}
// }


//Deleted Element
// import java.util.*;
// class Perform
// {
// 	Scanner sc=new Scanner(System.in);
// 	Perform()
// 	{
// 		System.out.println("Enter the size of array : ");
// 		int size=sc.nextInt();

// 		int arr[]=new int[size];
// 		System.out.println("Enter "+size+"Integer :");
// 		for(int i=0;i<size;i++)
// 		{
// 			arr[i]=sc.nextInt();
// 		}

// 		System.out.println("Enter the Element to be deleted : ");
// 		int delete=sc.nextInt();

// 		boolean flag=false;
// 		for(int i=0;i<size;i++)
// 		{
// 			if(arr[i]==delete)
// 			{
// 				for(int j=i;j<size-1;j++)
// 				{
// 					arr[j]=arr[j+1];
// 				}
// 				flag=true;
// 				size--;
// 				break;
// 			}
// 		}
// 		if(flag)
// 		{
// 			for(int i=0;i<size;i++)
// 			{
// 				System.out.print(arr[i]+" ");
// 			}
// 		}
// 		else
// 		{
// 			System.out.println("invalid");
// 		}

// 	}
// }


// class Cia2
// {
// 	public static void main(String[] args) 
// 	{
// 		Perform p=new Perform();
// 	}
// }


//File Menu

// import java.util.*;
// import java.io.*;
// class File_create
// {
// 	File_create()
// 	{
// 		try
// 		{
// 			File f=new File("D:\\sem-2\\java\\Mca5.txt");
// 			if(f.createNewFile())
// 				{
// 					System.out.println("File Created "+f.getName());
// 				}
// 			else
// 				{
// 					System.out.println("File already exists");
// 				}
// 		}
// 		catch(IOException io)
// 		{
// 			System.out.println(io);
// 			System.out.println("Error");
// 		}
// 	}
// }

// class File_name
// {
// 	File_name()
// 	{
// 		File f=new File("D:\\sem-2\\java\\Mca5.txt");
// 		System.out.println("File Name is : "+f.getName());
// 	}
// }

// class File_path
// {
// 	File_path()
// 	{
// 		File f=new File("D:\\sem-2\\java\\Mca5.txt");
// 		System.out.println("File Path is : "+f.getAbsolutePath());
// 	}
// }

// class File_canRead
// {
// 	File_canRead()
// 	{
// 		File f=new File("D:\\sem-2\\java\\Mca5.txt");
// 		System.out.println("File can read is : "+f.canRead());
// 	}
// }

// class File_canWrite
// {
// 	File_canWrite()
// 	{
// 		File f=new File("D:\\sem-2\\java\\Mca5.txt");
// 		System.out.println("File can write is : "+f.canWrite());
// 	}
// }
// class File_Write
// {
// 	File_Write()
// 	{
// 		try
// 		{
// 			FileWriter fw=new FileWriter("D:\\sem-2\\java\\Mca5.txt");
// 			try
// 			{
// 				fw.write("Hello World!!");
// 			}
// 			finally
// 			{
// 				fw.close();
// 			}
// 			System.out.println("File Wrote..");
// 		}
// 		catch(IOException io)
// 		{
// 			System.out.println(io);
// 		}
// 	}
// }

// class File_Read
// {
// 	File_Read()
// 	{
// 		try
// 		{
// 			FileReader fr=new FileReader("D:\\sem-2\\java\\Mca5.txt");
// 			try
// 			{
// 				int i;
// 				while((i=fr.read())!=-1)
// 				{
// 					System.out.println((char)i);
// 				}
// 			}
// 			finally
// 			{
// 				fr.close();
// 			}
// 		}
// 		catch(IOException io)
// 		{
// 			System.out.println(io);
// 		}

// 	}
// }

// class File_length
// {
// 	File_length()
// 	{
// 		File f=new File("D:\\sem-2\\java\\Mca5.txt");
// 		System.out.println("File length is : "+f.length());
// 	}
// }

// class File_rename
// {
// 	File_rename()
// 	{
// 		File f=new File("D:\\sem-2\\java\\Mca5.txt");
// 		File f1=new File("D:\\sem-2\\java\\krupali.txt");
// 		if(f.exists())
// 		{
// 			System.out.println(f.renameTo(f1));
// 		}
// 		else
// 		{
// 			System.out.println("File not found");
// 		}		

// 	}
// }

// class File_delete
// {
// 	File_delete()
// 	{
// 		File f=new File("D:\\sem-2\\java\\Mca5.txt");
// 		System.out.println("File delete is : "+f.delete());
// 	}
// }


// class Menu
// {
// 	Menu()
// 	{
// 		System.out.println("-----File Menu-----");
// 		System.out.println("1.file create");
// 		System.out.println("2.file name");
// 		System.out.println("3.file path");
// 		System.out.println("4.file can read");
// 		System.out.println("5.file can write");
// 		System.out.println("6.file write");
// 		System.out.println("7.file read");
// 		System.out.println("8.file length");
// 		System.out.println("9.file rename");
// 		System.out.println("10.file delete");
// 		System.out.println("11.exit");
// 	}
	
// }
// class Case
// {
// 	Scanner sc=new Scanner(System.in);
// 	Case()
// 	{
// 		System.out.println("Enter the above menu :");
// 		int no=sc.nextInt();

// 		switch(no)
// 		{
// 			case 1:
// 				new File_create();
// 				System.out.println("==============");
// 				break;
// 			case 2:
// 				new File_name();
// 				System.out.println("==============");
// 				break;
// 			case 3:
// 				new File_path();
// 				System.out.println("==============");
// 				break;
// 			case 4:
// 				new File_canRead();
// 				System.out.println("==============");
// 				break;
// 			case 5:
// 				new File_canWrite();
// 				System.out.println("==============");
// 				break;
// 			case 6:
// 				new File_Write();
// 				System.out.println("==============");
// 				break;
// 			case 7:
// 				new File_Read();
// 				System.out.println("==============");
// 				break;
// 			case 8:
// 				new File_length();
// 				System.out.println("==============");
// 				break;
// 			case 9:
// 				new File_rename();
// 				System.out.println("==============");
// 				break;
// 			case 10:
// 				new File_delete();
// 				System.out.println("==============");
// 				break;
// 			case 11:
// 				System.exit(0);
// 				break;
// 			default :
// 				System.out.println("Please enter above menu");
// 				System.out.println("==============");
// 				break;
// 		}

// 	}
// }
// class Cia2
// {
// 	public static void main(String[] args) 
// 	{
// 		while(true)
// 		{
// 			Menu m=new Menu();
// 			Case c=new Case();
// 		}
		
// 	}
// }



//Search string

import java.util.*;

class Perform
{
	Scanner sc=new Scanner(System.in);
	Perform()
	{
		System.out.println("Enter the main String : ");
		String mm=sc.nextLine();
		System.out.println("Enter the sub String : ");
		String ss=sc.nextLine();

		int l=mm.length();
		int p=0,freq=0;

		for(int i=0;i<l;i++)
		{
			char ch=mm.charAt(i);
			if(ch==' ')
			{
				String word=mm.substring(p,i);
				if(word.equalsIgnoreCase(ss))
				{
					freq++;
				}
				p=i+1;
			}
		}
		System.out.println(freq);
	}
}
class Cia2
{
	public static void main(String[] args) 
	{
		Perform p=new Perform();
	}
}