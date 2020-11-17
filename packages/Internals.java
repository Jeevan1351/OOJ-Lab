package CIE;

public class Internals extends Students
{
	int marks[] = new int[5];
	public void set_m(int[] arr)
	{
		marks = arr;
	}

	public void display()
	{
		System.out.println("Name: "+name+"\nUSN: "+usn+"Semester: "+sem+"\n");
		for(int i=0; i<5; i++)
			System.out.println("Subject "+i+": "+marks[i]);
	}
}

