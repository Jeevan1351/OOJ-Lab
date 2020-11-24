import java.util.*;

class Gen<P, Q, R>
{
	P a;
	Q b;
	R c;
	Gen(P l, Q m, R n)
	{
		a = l;
		b = m;
		c = n;
	}

	void showTypes()
	{
		System.out.println("a = "+a+"\t Type:"+a.getClass().getName());
		System.out.println("b = "+b+"\t Type:"+b.getClass().getName());
		System.out.println("c = "+c+"\t Type:"+c.getClass().getName());
	}
}

class GenDemo
{
	public static void main(String[] args)
	{
		Gen<Integer, String, Double> g = new Gen<Integer, String, Double>(98, "Jeevan", 238.3598);
		g.showTypes();
	}
}
