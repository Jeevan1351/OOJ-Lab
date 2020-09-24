import java.util.*;

class prime
{
	static boolean isprime(int a)
	{
		for(int i= 2; i<=a/2; i++)
		{
			if (a%i==0)
				return false;
		}
		return true;
	}




	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the two numbers:  ");
		int n1, n2;
		n1 = sn.nextInt();
		n2 = sn.nextInt();
		for(int i = n1; i<=n2; i++)
			if(isprime(i))
				System.out.print(i+" ");
	}
}

