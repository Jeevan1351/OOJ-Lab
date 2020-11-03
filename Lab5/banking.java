import java.util.*;

class Bank
{
	String name;
	int accno;
	char type;
	float bal, minb;
	void Bank()
	{
		accno = 0;
		type = 'S';
		name = null;
		bal = 0;
		minb = 1000;
	}
}

class Account extends Bank
{
	void displaybal()
	{
		System.out.println("The balance is:	"+bal);
	}

	void deposit(float d)
	{
		bal += d;
		System.out.println("Amount deposited!\nExisting Balance is:	"+bal);
	}

	void withdraw(float a)
	{
		if(a>bal)
			System.out.println("Insufficient funds!");
		else
		{
			bal -= a;
			System.out.println("Money withdrawn!\nExisting balance:	"+bal);
		}
	}

}

class Savacc extends Account
{
	void intrest()
	{
		float intr = bal*5/100;
		System.out.println("The intrest is:	"+intr);
		deposit(intr);
	}
}

class Curracc extends Account
{
	void minbal()
	{
		if(bal<minb)
		{
			System.out.println("Penalty imposed!\nExisting Balance:	"+(bal-50));
			bal -= 50;
		}
		else
			System.out.println("No penalty imposed!");
	}

}

class banking
{
	public static void main(String args[])
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("\t\tWelcome\n\t1]Savings Account\n\t2]Current Account\n\tEnter your choice:	");
		int ch = sn.nextInt();
		switch (ch)
		{
			case 1:
				sav();
				break;
			case 2:cur();
				break;
			case 3:
					System.out.println("Savings  selected by default");
					sav();
		}
	}
	static void sav()
	{
		Savacc c = new Savacc();
		int ch =10;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the name:	");
		c.name = sn.nextLine();
		System.out.println("Enter the account number:	");
		c.accno = sn.nextInt();
		while(ch != 5)
		{
			System.out.println("1] Deposit\n2] Withdraw\n3] Compute Intrest and Deposit\n4] View Balance\n5] Exit\nEnter your Choice: ");
			ch = sn.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Enter the amount to be deposited:	");
				float a = sn.nextFloat();
				c.deposit(a);
				break;
			case 2: System.out.println("Enter the ampunt to be withdrawn:	");
				a = sn.nextFloat();
				c.withdraw(a);
				break;
			case 3:c.intrest();
				break;
			case 4:c.displaybal();
			}
		}
	}
	static void cur()
	{
		Curracc c = new Curracc();
		int ch =10;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the name:	");
		c.name = sn.nextLine();
		System.out.println("Enter the account number:	");
		c.accno = sn.nextInt();
		while(ch != 5)
		{
			System.out.println("1] Deposit\n2] Withdraw\n3] Check minimum balance\n4] View Balance\n5] Exit\nEnter your Choice: ");
			ch = sn.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Enter the amount to be deposited:	");
				float a = sn.nextFloat();
				c.deposit(a);
				break;
			case 2: System.out.println("Enter the ampunt to be withdrawn:	");
				a = sn.nextFloat();
				c.withdraw(a);
				break;
			case 3:c.minbal();
				break;
			case 4: c.displaybal();
			}
		}
	}
}
