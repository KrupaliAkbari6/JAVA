import java.util.*;
import java.io.*;
class User
{
	Scanner sc=new Scanner(System.in);
	String u_write;
	User()
	{
		System.out.print("Enter the Word :");
		u_write=sc.nextLine();
	}

	void process()
	{
		try
		{
			FileWriter fw=new FileWriter("d:\\sem-2\\java\\file_handling\\Mca.txt");
			try
			{
				fw.write(u_write);
			}
			finally
			{
				fw.close();
			}
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
}



class User_writer
{
	public static void main(String[] args) 
	{
		User u=new User();
		u.process();
	}
}