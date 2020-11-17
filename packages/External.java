package SEE;

public class External extends CIE.Students
{
	int[] ms = new int[5];
	void set_s(int [] arr)
	{
		ms = arr;
	}

	void display()
	{
		System.out.println("Name: "+name+"\nUSN :"+usn+"\nSemester: "+sem+"\n");
		for(int i=0; i<5; i++)
		{
			System.out.println("Subject "+i+" : "+ms[i]);
		}
	}
}
