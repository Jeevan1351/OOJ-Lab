import java.util.*;

class staff
{
	int code;
	String name;
	void get_name()
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter name");
		name = sn.nextLine();
		System.out.println("Enter code");
		code = sn.nextInt();
	}
}

class teacher extends staff
{
	String subject;
	void get()
	{
		get_name();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Subject");
		subject = s.nextLine();
	}

	void display()
	{
		System.out.println("Name:"+name+"Code :"+code+"\nSubject :"+subject);
	}
}

class typist extends staff
{
	double speed;
	static int n = 0;
	void typist()
	{
		n += 1;
	}
	void get()
	{
		get_name();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter speed");
		speed = s.nextDouble();
	}
	void get_n()
	{
		System.out.println("Number of typists are:	"+n);
	}
}
class regular extends typist
{
	void display()
	{
		System.out.println("Name: "+name+" Code: "+code+"\nSpeed: "+speed+"Regular Typist");
	}
}
class casual extends typist
{
	double dw;
	void get_dw()
	{
		get();
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter Daily Wage");
		dw = sn.nextDouble();
	}

	void display()
	{
		System.out.println("Name: "+name+ "Code: "+code+ "Daily wage" + dw);
	}
}

class officer extends staff
{
	char grade;
	void get()
	{
		Scanner s = new Scanner(System.in);
		get_name();
		System.out.println("Enter grade");
		grade = s.next().charAt(0);
	}

	char get_grade()
	{
		return grade;
	}
	void display()
	{
		System.out.println("Name: "+name+ "Code: "+code+ "Grade" + grade);
	}

}

class employee
{
	public static void main(String args[])
	{
		Scanner sn = new Scanner(System.in);
		int ch = 10;
			int t=0, rt =0, ct=0, o =0;
			teacher [] tea = new teacher[5];
			regular [] rty = new regular[5];
			casual [] cty = new casual[5];
			officer [] of = new officer[5];
		while(ch!=6)
		{
			System.out.println("1] Creat Teacher\n2] Create Regular Typist\n3]Create Casual typist\n4]Creat office\n5]No. of typists\n6]Exit\n7]Show Details\n8]Get Officer");
			ch = sn.nextInt();
			switch(ch)
			{
				case 1:
					tea[t] = new teacher();
					tea[t].get();
					tea[t].display(); t++; break;
				case 2:
					rty[rt] = new regular();
					rty[rt].get(); rt++; break;
				case 3:
					cty[ct] = new casual();
					cty[ct].get_dw();
					ct++; break;
				case 4: of[o] = new officer();
					of[o].get(); o++;
					break;
				case 5: rty[rt-1].get_n();
					break;
				case 6: break;
				case 7: tea[t-1].display();
					of[o-1].display();
					rty[rt-1].display();
					cty[ct-1].display();
					break;
				case 8: System.out.println("Enter grade");
					char g = sn.next().charAt(0);
					for(int i= 0; i<o;i++)
						if(of[i].get_grade() == g)
							of[i].display();
			}
		}
	}
}
