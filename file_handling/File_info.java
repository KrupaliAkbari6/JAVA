import java.io.*;
class File_info
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("d:\\sem-2\\java\\file_handling\\Mca.txt");

		System.out.println("File Name ->"+f.getName());

		System.out.println("File Path ->"+f.getAbsolutePath());

		System.out.println("File Read ->"+f.canRead());

		System.out.println("File Write ->"+f.canWrite());

		System.out.println("File Length ->"+f.length());

		//System.out.println("Remove File ->"+f.delete());
		
	}
}

