import java.util.*;

class Perform
{
	Scanner sc=new Scanner(System.in);
	Perform()
	{
		System.out.println("Enter Main String : ");
		String ms=sc.nextLine();
		System.out.println("Enter Sub String : ");
		String ss=sc.nextLine();
		int len=ms.length();
		int p=0,freq=0;

		for(int i=0;i<len;i++)
		{
			char ch=ms.charAt(i);
			if(ch==' ')
			{
				String word=ms.substring(p,i);
				if(word.equalsIgnoreCase(ss))
				{
					freq++;
				}
				p=i+1;

			}
		}
		System.out.println("No of times substirng is present in the main string :  "+freq);

	}
}

class Search_string
{
	public static void main(String[] args) 
	{
		Perform p=new Perform();
	}
}