package CIE;

import java.util.*;

public class Student
{
	public String name, usn;
	public int sem;
	public void input()
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the Name, USN and Semester!");
		name = sn.nextLine();
		usn = sn.nextLine();
		sem = sn.nextInt();
	}
	public void display()
	{
		System.out.println("Name: "+name+"\tUSN: "+usn+"Sem: "+sem);
	}
}

