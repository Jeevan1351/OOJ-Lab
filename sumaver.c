#include<stdio.h>
#include<math.h>

float sumaver(int a, int b)
{
	printf("\nThe sum of the numbers is %d", a+b);
	return (a+b)/2.0;
}


void printeven(int a, int b)
{
	if (b%2!= 0)
		b += 1;
	else
	    b += 2;
	for(; b< a; b+=2)
		printf("%d  ", b);
}
		


int main()
{
	int a, b, c;
	printf("Enter three numbers:	");
	scanf("%d %d %d", &a, &b, &c);
	int m1,m2;
	
	if (a>b)
	{
		if (a>c)
		{	m1 = a;
			if (b>c)
				m2 = b;
			else
				m2 = c;
		}
		else
		{	
			m1 = c;
			m2 = a;
		}
	}
	else
	{
		if(b>c)
		{
			m1 = b;
			if (a>c)
				m2 = a;
			else
				m2 = c;
		}
		else
		{
			m2 = b;
			m1 = c;
		}
	}
	printf("These are the two greatest numbers %d %d",m1,m2);
	printf("\nThe average of the two numbers is %.2f\n", sumaver(m1, m2));
	printeven(m1, m2);
}
