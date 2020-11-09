import java.util.*;

class series
{
	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter a number:	");
		int n = sn.nextInt();
		int i, j=1, k;
		for(i=0; i<n; i++)
		{
			for(k=0; k<=i;k++)
			{
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
		}
	}
}

