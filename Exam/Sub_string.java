//count  the vowel in the string 
import java.util.*;
class Perform
{

	Scanner sc=new Scanner(System.in);
	String str;
	Perform()
	{
	System.out.println("Enter Sentence :");
	str=sc.nextLine();
	str+=" ";
	int len=str.length();
	String t=" ";
	int count=0,p=0;
	System.out.println("words \t vowel");
	for(int i=0;i<len;i++)
	{
		char ch=str.charAt(i);
		if(ch==' ')
		{
			t=str.substring(p,i);
			count=0;
			for(int j=0;j<t.length();j++)
			{
				char k=t.charAt(j);
				if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'||k=='A'||k=='E'||k=='I'||k=='O'||k=='U')
				count++;
			}

			System.out.println(t+"\t "+count);
			p=i+1;
		}
	}


	}

}

class Sub_string
{
	public static void main(String[] args) 
	{
		Perform p=new Perform();
	}
}


