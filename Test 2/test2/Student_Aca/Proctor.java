package Student_Aca;
import java.util.*;
public class Proctor
{
	public int pid;
	public String name;

	public void get_p()
	{
		Scanner sn= new Scanner(System.in);
		System.out.println("For Proctor\nEnter Proctor ID and Name");
		pid = sn.nextInt();
		name = sn.nextLine();
		name = sn.nextLine();
	}

	public void disp_p()
	{
		System.out.println("Proctor ID: "+pid+"Name: "+name);
	}
}

