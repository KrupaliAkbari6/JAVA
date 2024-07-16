import java.util.*;
import java.sql.*;

class Menu
{
	Menu()
	{
		System.out.println("Curd Operation");
		System.out.println("1.Insert Data");
		System.out.println("2.Display Data");
		System.out.println("3.Search Data");
		System.out.println("4.Update Data");
		System.out.println("5.Delete Data");
		System.out.println("6.Exit");
	}
}

class Case extends Connect
{
	Case()
	{
		while(true)
		{
			new Menu();
			System.out.println("Enter the Above Choice No :");
			int no=sc.nextInt();
			switch(no)
			{
				case 1:
					new Insert();
					break;
				case 2:
					new Display();
					break;
				case 3:
					new Search();
					break;
				case 4:
					new Update();
					break;
				case 5:
					new Delete();
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Please Enter Above Menu");				 
			}
		}

	}
}

class Connect
{
	Scanner sc=new Scanner(System.in);
	String url;
	String username;
	String password;
	Connection con;
	Connect()
	{
			try
			{
				url="jdbc:mysql://localhost:3306/mca";
				username="root";
				password="";
				con=DriverManager.getConnection(url,username,password);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}

class Create_table extends Connect
{
	Create_table()
	{
		try
		{
			String query="create table student(sid int(10) primary key auto_increment, s_name varchar(100) not null, s_stream varchar(100) not null)";
			Statement st=con.createStatement();
			st.executeUpdate(query);
			System.out.println("Table is Created");
		}
		catch(SQLException e)
		{
			if(e.getErrorCode() == 1050)
			{
				System.out.println("table Already Exists");
			}
			else
			{
				e.printStackTrace();
			}
		}
	}
}

class Insert extends Connect
{
	Insert()
	{
		try
		{
			System.out.println("Enter the Student Name :");
			String nm=sc.nextLine();

			System.out.println("Enter the Student Stream :");
			String stream=sc.nextLine();

			String query="Insert into student(s_name,s_stream) values('"+nm+"','"+stream+"')";

			PreparedStatement pst=con.prepareStatement(query);
			pst.executeUpdate();
			System.out.println("Data Inserted In the Table");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Display extends Connect
{
	Display()
	{
		try
		{
			String query="SELECT * FROM student";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);

			System.out.println("\tStudent ID \t Student Name \t Student Stream");
			System.out.println("\n\t------------------------------------------------");

			while(rs.next())
			{
				System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\n");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Search extends Connect
{
	Search()
	{
		try
		{
			System.out.println("Enter the Search Record : ");
		int search_record=sc.nextInt();

		String query="SELECT * FROM student WHERE sid='"+search_record+"'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);

		System.out.println("\t Student Id \t Student Name \t Student Stream");
		System.out.println("\n\t---------------------------------------------");

		while(rs.next())
		{
			System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
		}
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}

class Update extends Connect
{
	Update()
	{
			try
			{
				new Display();

				System.out.println("Enter Update Id :");
				String s_id=sc.nextLine();

				System.out.println("Enter Update Name : ");
				String s_nm=sc.nextLine();

				System.out.println("Enter Update Stream : ");
				String s_str=sc.nextLine();

				String query="UPDATE student SET s_name='"+s_nm+"',s_stream='"+s_str+"' WHERE sid='"+s_id+"' ";

				Statement st=con.createStatement();
				int update=st.executeUpdate(query);
				if(update==1)
				{
					System.out.println("Record Updated");
					new Display();
				}
				con.close();

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}

class Delete extends Connect
{
	Delete()
	{
		try
		{
			new Display();
			System.out.println("Enter a Deleted Record :");
			int s_id=sc.nextInt();

			String query="DELETE FROM student WHERE sid='"+s_id+"'";
			Statement st=con.createStatement();
			int delete=st.executeUpdate(query);
			System.out.println(delete+"  Record Deleted");
			if(delete==1)
			{
				new Display();
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Cia
{
	public static void main(String[] args) 
	{
		new Create_table();
		new Case();
	}
}