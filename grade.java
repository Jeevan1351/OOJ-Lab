import java.util.*;

class grade
{
	static char alpha(int marks)
	{
		if(marks>=90)
			return 'S';
		else if(marks>=80)
			return 'A';
		else if(marks>=70)
			return 'B';
		else if(marks>=60)
			return 'C';
		else if(marks>=50)
			return 'D';
		else
			return 'F';
	}




	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the number of subjects:	");
		int n = sn.nextInt();
		int i = 0;
		int cie, see;
		int total[] = new int[n];
		while(i<n)
		{
			System.out.print("Enter the C.I.E. marks in Subject "+(i+1)+":  ");
			cie = sn.nextInt();
			System.out.print("\nEnter the S.E.E. marks in Subject "+(i+1)+":  ");
			see = sn.nextInt();
			total[i] = cie + see/2;
			i++;
		}
		i = 0;
		while(i<n)
		{
			System.out.println("Grade in Subject "+(i+1)+" is "+alpha(total[i]));
			i++;
		}
	}
}
