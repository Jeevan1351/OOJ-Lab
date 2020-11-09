#include<stdio.h>

int main()
{
	float cie, see, sum;
	printf("Enter cie marks:	");
	scanf("%f", &cie);
	printf("\nEnter SEE marks:	");
	scanf("%f", &see);
	see = see/2;
	sum = cie + see;
	if (sum>= 90)
		printf("\n\t Your Grade is: S");
	else if(sum>=80)
		printf("\n\tYour Grade is: A");
	else if(sum>=70)
		printf("Your Grade is: B");
	else if(sum>=60)
		printf("Your Grade is: C");
	else if(sum>=50)
		printf("Your Grade is: D");
	else
		printf("Your Grade is: F");
	printf("\n");
}

