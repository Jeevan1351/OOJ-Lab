import CIE.*;
import SEE.*;

class pack
{
	public static void main(String args[])
	{
		Internals inter = new Internals();
		inter.name = "Jeevan";
		inter.usn = "1BM19Cs084";
		inter.sem = 3;
		int [] int_m = new int[]{35, 48, 50, 33, 42};
		inter.set_m(int_m);
		int[] see_m = new int[]{92, 84, 99, 72, 68};
		inter.display();
		External exter = new External();
		exter.set_m(see_m);
		exter.name = "Jeevan";
		exter.usn = "1BM19CS084";
		exter.sem = 3;
		exter.display();
	}
}

