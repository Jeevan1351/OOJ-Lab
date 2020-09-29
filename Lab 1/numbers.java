import java.util.*;
class numbers
{
	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the size of the array!");
		int n = sn.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements of the array!");
		for(int i=0;i<n;i++)
			arr[i] = sn.nextInt();
		int p=0, ne=0, z=0;
		for(int i=0;i<n;i++)
		{
			if (arr[i]>0)
				p++;
			else if(arr[i]<0)
				ne++;
			else
				z++;
		}
		System.out.println("The number of positive elements are:	"+p+"\nThe number of negative elements are:	"+ne+"\nThe Number of zero numbers are:	"+z);
	}
}

