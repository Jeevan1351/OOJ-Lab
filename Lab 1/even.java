import java.util.*;

class even
{
	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sn.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the values of the array");
		for(int i=0;i<n;i++)
			a[i] = sn.nextInt();
		int[] b = new int[n];
		int[] c = new int[n];
		int j=0,k=0,total=0;
		for(int i=0;i<n;i++)
			if(a[i]%2!=0)
			{
				b[j] = a[i];
				j++;
			}
			else
			{
				c[k] = a[i];
				k++;
				total+= a[i];
			}
		int ma = c[0], mi = c[0];
		for(int i =1;i<k;i++)
		{
			if(c[i]>ma)
				ma = c[i];
			if(c[i]<mi)
				mi=c[i];
		}
		System.out.println("The sum of the even elements of the array is: " +total+"\nThe average is "+(total/2.0)+"\nThe maximum is: "+ma+" The minimum is: "+mi);
	}
}
