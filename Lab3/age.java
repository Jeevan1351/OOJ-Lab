import java.util.*;

class Age
{
	int agey, agem;

	void set()
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the age in years and months");
		agey = sn.nextInt();
		agem = sn.nextInt();
	}

	int get_year()
	{
		return agey;
	}

	int get_month()
	{
		return agem;
	}
}

class age
{
	public static void main(String[] args)
	{
		System.out.println("Adam:");
		Age p1 = new Age();
		p1.set();
		System.out.println("Fauna:");
		Age p2 = new Age();
		p2.set();
		if(p1.get_year()>p2.get_year())
		{
			System.out.println("Adam is older");
		}
		else if(p1.get_year()==p2.get_year())
		{
			if(p1.get_month()>p2.get_month())
			System.out.println("Adam is older");
			else if(p1.get_month() == p2.get_month())
			System.out.println("They are of same age!");
			else
			System.out.println("Fauna is older");
		}
		else
			System.out.println("Fauna is older");
	}
}

