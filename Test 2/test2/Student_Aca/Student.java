package Student_Aca;
import java.util.*;
public class Student
{
	public String usn, name;
	public int age, procid;
	public double cgpa;

	public void get_s()
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("For Student\nEnter the USN, Name, Age, Proctor ID and CGPA");
		usn = sn.nextLine();
		name = sn.nextLine();
		age = sn.nextInt();
		procid = sn.nextInt();
		cgpa = sn.nextDouble();
	}

	public void disp_s()
	{
		System.out.println("NAme: "+name+"\nUSN: "+usn+"\nAge: "+age+"\nProctor ID: "+procid+"CGPA: "+cgpa);
	}
}

