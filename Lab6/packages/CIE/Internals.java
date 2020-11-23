package CIE;
import java.util.*;

public class Internals extends Student
{
	public int [] i_marks = new int[5];
	public void minput()
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the Internals marks ");
		for(int i =0; i < 5; i++)
		{
			System.out.println("Suject "+(i+1));
			i_marks[i] = sn.nextInt();
		}
	}

}
