import java.util.*;

class student
{
	String usn, name;
	int[] marks = new int[5];
	int[] credits = new int[5];
	int[] grade = new int[5];
	void showd()
	{
		System.out.println("USN:	"+usn);
		System.out.println("Name:	"+name);
		System.out.println("Marks:	"+marks[0]+" "+marks[1]+" "+marks[2]+" "+marks[3]+" "+marks[4]);
		System.out.println("Credits:	"+credits[0]+" "+credits[1]+" "+credits[2]+" "+credits[3]+" "+credits[4]+" ");
	}
	void acceptd()
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the name");
		name = sn.nextLine();
		System.out.println("Enter the USN");
		usn = sn.nextLine();
		System.out.println("Enter the marks in subjects");
		marks[0] = sn.nextInt();
		marks[1] = sn.nextInt();
		marks[2] = sn.nextInt();
		marks[3] = sn.nextInt();
		marks[4] = sn.nextInt();
		System.out.println("Enter the Credits for respective subjects");
		credits[0] = sn.nextInt();
		credits[1] = sn.nextInt();
		credits[2] = sn.nextInt();
		credits[3] = sn.nextInt();
		credits[4] = sn.nextInt();
	}

	void compute()
	{
		int sum=0, sumc = 0;
		for(int i =0; i<5;i++)
		{
			if (marks[i]>90)
				grade[i]=10;
			else if(marks[i]>80)
				grade[i] = 9;
			else if(marks[i]>70)
				grade[i] = 8;
			else if(marks[i]>60)
				grade[i] = 7;
			else if(marks[i]>50)
				grade[i]=6;
			else
				grade[i]=0;
			sum = sum + grade[i]*credits[i];
			sumc += credits[i];
		}
		System.out.println("The S.G.P.A is:	"+(sum*1.0/sumc));
	}
}

class Student
{
	public static void main(String[] args)
	{
		student std = new student();
		std.acceptd();
		std.showd();
		std.compute();
	}
}

