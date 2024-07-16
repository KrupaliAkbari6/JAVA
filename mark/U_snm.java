package mark;
import java.util.*;
public class U_snm
{
	Scanner sc=new Scanner(System.in);
	String s_nm[]=new String[5];
	public U_snm()
	{
		int k=1;
		for(int i=0;i<s_nm.length;i++)
		{
			System.out.print("Enter Subject Name :->"+k);
			s_nm[i]=sc.nextLine();
			k++;
		}
	}
}