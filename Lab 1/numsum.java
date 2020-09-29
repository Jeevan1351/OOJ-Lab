import java.util.*;

class numsum
{
	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sn.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array!");
		for(int i=0; i<n; i++)
			arr[i] = sn.nextInt();
		int osum=0, esum=0;
		for(int i=0;i<n;i+=2)
			esum+=arr[i];
		for(int i=1;i<n;i+=2)
			osum+=arr[i];
		System.out.println("The sum of the EVEN indices is:	"+esum+"\nThe sum of the ODD indices is:	"+osum);
	}
}

