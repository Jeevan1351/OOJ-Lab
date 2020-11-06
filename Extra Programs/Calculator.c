#include<stdio.h>
#include<math.h>

int main()
{
	int a,b,ch =11;
	while(ch != 0)
	{
		printf("\t\t\tCalculator");
		printf("\n\t1]Addition\n\t2]Subtraction\n\t3]Multiplication\n\t4]Division\n\t5]Equals\n\t6]NotEquals\n\t7]Greater\n\t8]Lesser\n\t9]Modulos\n\t10]Exponential\n\t0]EXIT!\n\n\t");
		scanf("%d",&ch);
		if (ch!=0)
		{
			printf("Enter the values for a and b\t");
			scanf("%d %d", &a,&b);
		}
		printf("\t");
		switch(ch)
		{
			case 1:printf("%d",a+b);
			break;
			case 2:printf("%d",a-b);
			break;
			case 3: printf("%d",a*b);
			break;
			case 4: printf("%d",a/b);
			break;
			case 5: printf("%s",(a!=b)?"Not Equal":"Equal");
			break;
			case 6: printf("%s",(a!=b)?"Not Equal":"Equal");
			break;
			case 7: printf("%d",(a<b)?a:b);
			break;
			case 8: printf("%d",(a<b)?a:b);
			break;
			case 9: printf("%d",a%b);
			break;
			case 10: printf("%d",(int)pow(a,b));
			break;
			case 0: printf("\n\t\tThank you");
			break;
			default:
			printf("Enter a correct option\t");
		}
		printf("\n\n");
	}
}
