#include<stdio.h>

int main()
{
	int i, k, n, j=1;
	printf("Enter value of n:	");
	scanf("%d", &n);
	for(i=0;i<n;i++)
	{
		for(k=0;k<=i;k++, j++)
			printf("%d ", j);
		printf("\n");
	}
}

