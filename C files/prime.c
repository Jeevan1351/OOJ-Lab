#include<stdio.h>

int prime(int n)
{
	for(int i = 2; i<n/2; i++)
	{
		if(n%i==0)
			return 0;
	}
	return 1;
}


int main()
{
	int n1, n2;
	printf("Enter the starting and ending number:   ");
	scanf("%d %d", &n1, &n2);
	for(; n1<=n2;n1++)
			if(prime(n1))
				printf ("%d ",n1);
	printf("\n");
}

