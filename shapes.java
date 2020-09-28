import java.util.*;
import java.lang.Math;

class shapes
{
	public static void main(String[] args)
	{
		int ch=10;
		Scanner sn = new Scanner(System.in);
		while(ch!=4)
		{
			System.out.print("1]Cylinder\n2]Cone\n3]Sphere\n4]Exit!\nMake your Choice:	");
			ch = sn.nextInt();
			switch(ch)
			{
			case 1:cylinder();
					break;
			case 2:cone();
					break;
			case 3:sphere();
					break;
			case 4:System.out.println("Have a nice day! : )");
					break;
			default:System.out.println("Enter a valid choice!");
			}
		}
	}

	static void cylinder()
	{
		Scanner sn = new Scanner(System.in);
		System.out.print("\nEnter the radius and the height");
		double r = sn.nextDouble();
		double h = sn.nextDouble();
		double a = 2*3.14*r*h+2*3.14*r*r;
		double v = 3.14*r*r*h;
		System.out.println("\n The Area of the Cylinder is:	"+a);
		System.out.println("The volume of the Cylinder is:	"+v);
	}


	static void cone()
	{
		Scanner sn = new Scanner(System.in);
		System.out.print("\nEnter the radius and the height of the Cone:	");
		double r = sn.nextDouble();
		double h = sn.nextDouble();
		double a = 3.14*r*(r+Math.sqrt(h*h+r*r));
		double v = 3.14*r*r*h/3;
		System.out.println("\n The Area of the Cone is:	"+a);
		System.out.println("The volume of the Cone is:	"+v);
	}


	static void sphere()
	{
		Scanner sn = new Scanner(System.in);
		System.out.print("\nEnter the radius of the Sphere:	");
		double r = sn.nextDouble();
		double a = 3.14*4*r*r;
		double v = a*r/3;
		System.out.println("\n The Area of the Sphere is:	"+a);
		System.out.println("The volume of the Sphere is:	"+v);
	}

}
