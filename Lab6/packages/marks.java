import java.util.*;
import CIE.*;
import SEE.*;

class marks
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int f[] = new int[5];
		Student s = new Student();
		s.input();
		Internals i = new Internals();
		External e = new External();
		i.name = s.name;
		i.usn = s.usn;
		i.sem = s.sem;
		e.sem = s.sem;
		e.name = s.name;
		e.usn = s.usn;
		i.minput();
		e.einput();
		s.display();
		System.out.println("Final marks are!");
		for(int j =0; j<5; j++)
		{
			f[j] = i.i_marks[j] + e.e_marks[j]/2;
			System.out.println("Subject "+(j+1)+" : "+f[j]);
		}
	}
}
