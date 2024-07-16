import java.io.*;
class Read
{
	Read()
	{
		try
		{
			FileReader fr=new FileReader("d:\\sem-2\\java\\file_handling\\Mca.txt");
			try
			{
				int i;
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
				}
			}
			finally
			{
				fr.close();
			}
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		} 
	}
}

class File_reader
{
	public static void main(String[] args) 
	{
		Read r=new Read();	
	}
}