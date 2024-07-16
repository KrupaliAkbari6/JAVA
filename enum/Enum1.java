enum Mca
{
	Sem1(6),Sem2(5),Sem3(4),Sem4(3);

	int no_of_subjects;
	Mca(int no_of_subjects)
	{
		this.no_of_subjects=no_of_subjects;
	}
	int Sem()
	{
		return no_of_subjects;
	}
}

class Enum1
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Mca m1=Mca.Sem2;
		// System.out.println("Semester : "+m1.name()+" Total Number of Subjects : "+m1.no_of_subjects+"\n");


		for(Mca m:Mca.values())
		{
			Thread.sleep(1000);
			System.out.println((m.ordinal()+1)+" Semester : "+m.name()+"Total Number of Subjects : "+m.no_of_subjects+"\n");
			
	}
		}
}