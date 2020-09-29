import java.util.*;
import java.lang.Math;

class quadroots
{
	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);
		double a, b, c;
		System.out.println("If ax^2 + bx + c = 0 is a quadratic equation\nThen enter the value of a");
		a = sn.nextDouble();
		System.out.println("enter the value of b");
		b = sn.nextDouble();
		System.out.println("enter value of c");
		c = sn.nextDouble();
		double d = b*b - 4*a*c;
		if(d<0)
		{
			System.out.println("The Discriminant is negative! Equation has imiginary roots!!");
			System.exit(0);
		}
		d = Math.sqrt(d);
		double r1, r2;
		b = b*-1;
		r1 = (b+d)/(2*a);
		r2 = (b-d)/(2*a);
		System.out.println("The roots of the equation are "+r1+"and "+r2);
	}
}
