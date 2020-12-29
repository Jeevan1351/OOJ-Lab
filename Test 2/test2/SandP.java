import java.util.*;
import Student_Aca.*;

class SandP
{
	public static void main(String args[])
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of Students ");
		int ns = sn.nextInt();
		System.out.println("Enter the number of Proctors ");
		int np = sn.nextInt();
		Student s[] = new Student[ns];
		Proctor p[] = new Proctor[np];
		for(int i = 0; i<ns; i++)
		{
			s[i] = new Student();
			gets(s[i]);
		}
		for(int i = 0; i<np; i++)
		{
			p[i] = new Proctor();
			getp(p[i]);
		}
		for(int i = 0; i<ns; i++)
		{
			disps(s[i]);
		}
		for(int i = 0; i<np; i++)
		{
			dispp(p[i]);
		}
	}

	static void gets(Student k)
	{
		k.get_s();
	}
	static void disps(Student k)
	{
		k.disp_s();
	}
	static void getp(Proctor k)
	{
		k.get_p();
	}
	static void dispp(Proctor k)
	{
		k.disp_p();
	}
}
