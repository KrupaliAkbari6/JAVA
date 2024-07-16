

/*class Cmd1
{
	public static void main(String[] ak) {
		if(ak.length!=0)
		{
		int no=Integer.parseInt(ak[0]);
		System.out.println("square : " +no*no);
		System.out.println("cube : " +no*no*no);
		
		}
		else
		{
			System.out.println("provide arguments");
		}
	}
}

class Cmd1
{
	public static void main(String[] ak) {
		if(ak.length!=0)
		{
		int no=Integer.parseInt(ak[0]);
		int no1=Integer.parseInt(ak[1]);
		System.out.println("addition : " +(no+no1));
		
		
		}
		else
		{
			System.out.println("provide arguments");
		}
	}
}

class Cmd2
{
	public static void main(String[] args)
	{
		for(String nm:args)
		{
			System.out.println(nm);
		}
	}
}


import java.util.*;
class Cmd4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1 : ");
		int no1=sc.nextInt();
		System.out.println("this no is : " + no1);
	}
}

import java.util.*;
class Cmd5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value : ");
		String  name=sc.nextLine();
		System.out.println("your name is " + name);
	}
}

class One
{
	void dis()
	{
		System.out.println("hello.... ");
	}
}
class Cmd6
{
	public static void main(String[] args)
	{
		One o=new One();
		o.dis();
	}
}*/


//ARGUMENTS
//------------------------

//without argument without returm type
/*class One 
{
	void display()
	{
		int no=10;
		System.out.println("square : " + no*no);
	}
}

class Cmd1
{
	public static void main(String[] args) {
		One obj=new One();
		obj.display();
	}
}*/

//with argument without returm type
/*class One 
{
	void display(int no)
	{
		System.out.println("square" + no*no);
	}
}

class Cmd1
{
	public static void main(String[] args) {
		One obj=new One();
		obj.display(10);
	}
}*/

//with argument with returm type
/*class One
{
	public int display(int no)
	{
		return no * no;
	}
}

class Cmd1
{
	public static void main(String[] args) {
		One obj=new One();
		int s=obj.display(10);
		System.out.println("square : " +s);
	}
}*/

//without argument with returm type
class One
{
	public int display()
	{
		int no=10;
		return no * no;
	}
}

class Cmd1
{
	public static void main(String[] args) {
		One obj=new One();
		int s=obj.display();
		System.out.println("square : " + s);
	}
}
