package mark;
import pack.*;
public class Display
{
	U_marks um=new U_marks();
	public Display()
	{
		int k=1,t=0,per=0;
		for(int i=0;i<um.marks.length;i++)
		{
			System.out.println(k+" ->"+um.u.s_nm[i]+"=>"+um.marks[i]);
			t=t+um.marks[i];
			k++;
		}
		per = t/um.marks.length;
		System.out.println("Total :"+t);
		System.out.println("Percentage :"+per);
	}
}