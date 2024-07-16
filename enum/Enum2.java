enum Months
{
	Jan(31),Feb(28),Mar(31),Apr(30),May(31),June(30),July(31),Aug(31),Sep(30),Oct(31),Nov(30),Dec(31);

	int no_of_day;
	Months(int no_of_day)
	{
		this.no_of_day=no_of_day;
	}
	int day()
	{
		return no_of_day;
	}
}

class Enum2
{
	public static void main(String[] args) throws InterruptedException
	{
		int total_days=0;
		for(Months m:Months.values())
		{ 
			Thread.sleep(1000);
			System.out.println((m.ordinal()+1)+"->Months Name : "+m.name()+"->"+"Days : "+m.no_of_day+"\n");
			total_days=total_days+m.no_of_day;
		}
		System.out.println(total_days);
	}
}