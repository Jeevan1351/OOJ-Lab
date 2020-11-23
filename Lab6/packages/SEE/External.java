package SEE;
import CIE.*;
import java.util.*;

public class External extends CIE.Student
{
	public int [] e_marks = new int[5];
	public void einput()
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the semester marks");
		for(int i =0; i<5; i++)
		{
			System.out.println("Sybject "+i);
			e_marks[i] = sn.nextInt();
		}
	}
}
