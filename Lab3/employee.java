import java.util.*;

class Employee
{
	int empid;
	String empname;
	int empnohrs;
	double empbasic;
	double emphra, empda, empit, empgross;
	void set()
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		empid = sn.nextInt();
		System.out.println("Enter Employee name");
		empname = sn.nextLine();
		empname = sn.nextLine();
		System.out.println("Enter Number of hours worked");
		empnohrs = sn.nextInt();
		System.out.println("Enter Employee basic amount,HRA(%), Da(%), IT(%)");
		empbasic = sn.nextDouble();
		emphra = sn.nextDouble();
		empda = sn.nextDouble();
		empit = sn.nextDouble();
	}

	void calc()
	{
		empgross = empbasic +empbasic*(emphra)+ empbasic*(empda)-empbasic*(empit);
		System.out.println("Gross salary is : "+empgross);
	}

	void upcalc()
	{
		if(empnohrs<200)
		{
			empgross-=(200-empnohrs)*100;
		}
		else
			empgross+=(empnohrs-200)*100;
	System.out.println("Updated Gross salary is : "+empgross);
	}
}


class employee
{
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		emp.set();
		emp.calc();
		emp.upcalc();
	}
}

