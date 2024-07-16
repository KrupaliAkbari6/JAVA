import java.io.*;
import java.util.*;

class Create_file
{
	Create_file()
	{
		try
		{
			File f=new File("d:\\sem-2\\java\\Student.txt");
			if(f.createNewFile())
			{
				System.out.println("File Created :"+f.getName());
			}
			else
			{
				System.out.println("File already Exists");
			}
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
}


class File_name
{
	File_name()
	{
		File f=new File("d:\\sem-2\\java\\Student.txt");
		System.out.println("File Name is : "+f.getName());
	}
}

class File_path
{
	File_path()
	{
		File f=new File("d:\\sem-2\\java\\Student.txt");
		System.out.println("File Path is : "+f.getAbsolutePath());
	}
}

class File_canread
{
	File_canread()
	{
		File f=new File("d:\\sem-2\\java\\Student.txt");
		System.out.println("File can Read is : "+f.canRead());
	}
}

class File_canwrite
{
	File_canwrite()
	{
		File f=new File("d:\\sem-2\\java\\Student.txt");
		System.out.println("File can Write is : "+f.canWrite());
	}
}

class File_write
{
	File_write()
	{
		try
		{
			FileWriter f=new FileWriter("d:\\sem-2\\java\\Student.txt");
			try
			{
				f.write("Hello stuent");
			}
			finally
			{
				f.close();
			}
			System.out.println("File Wrote");	
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
		
	}
}

class File_read
{
	File_read()
	{
		try
		{
			FileReader f=new FileReader("d:\\sem-2\\java\\Student.txt");
			try
			{
				int i;
				while((i=f.read())!=-1)
				{
					System.out.print((char)i);
				}
			}
			finally
			{
				f.close();
			}
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
	}
}

class File_length
{
	File_length()
	{
		File f=new File("d:\\sem-2\\java\\Student.txt");
		System.out.println("File Name is : "+f.length());
	}
} 


class File_rename
{
	File_rename()
	{
		File f=new File("d:\\sem-2\\java\\Student.txt");
		File f1=new File("d:\\sem-2\\java\\Stud.txt");
		if(f.exists())
		{
			System.out.println(f.renameTo(f1));
		}
		else
		{
			System.out.println("File Not Found");
		}

	}
}

class File_delete
{
	File_delete()
	{
		File f=new File("d:\\sem-2\\java\\Stud.txt");
		System.out.println("File Delete is : "+f.delete());
	}
} 

class Menu
{
	Menu()
	{
		System.out.println("------File Menu--------");
		System.out.println("1.File Created");
		System.out.println("2.File Name");
		System.out.println("3.File Path");
		System.out.println("4.File can read");
		System.out.println("5.File can Write");
		System.out.println("6.File write");
		System.out.println("7.File read");
		System.out.println("8.File Size");
		System.out.println("9.File Rename");
		System.out.println("10.File Delete");
		System.out.println("11.Exit");
	}
}

class Case
{
	Scanner sc=new Scanner(System.in);
	int no;
	Case()
	{
		System.out.println("Enter Choice number : ");
		no=sc.nextInt();
		switch(no)
		{
			case 1:
				new Create_file();
				System.out.println("=======================================");
				break;
			case 2:
				new File_name();
				System.out.println("=======================================");
				break;
			case 3:
				new File_path();
				System.out.println("=======================================");
				break;
			case 4:
				new File_canread();
				System.out.println("=======================================");
				break;
			case 5:
				new File_canwrite();
				System.out.println("=======================================");
				break;
			case 6:
				new File_write();
				System.out.println("=======================================");
				break;
			case 7:
				new File_read();
				System.out.println("=======================================");
				break;
			case 8:
				new File_length();
				System.out.println("=======================================");
				break;
			case 9:
				new File_rename();
				System.out.println("=======================================");
				break;
			case 10:
				new File_delete();
				System.out.println("=======================================");
				break;
			case 11:
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter the above Menu");
				
		}
	}
}


class File_info
{
	public static void main(String[] args) 
	{
		//Create_file cf=new Create_file();
		while(true)
		{
			Menu m=new Menu();
			Case c=new Case();
		}
	}
}