#include<stdio.h>
#include<math.h>

int main()
{
	int ch=10, c;
	float A, V, r, h;
	while(ch!=4)
	{printf("\n\n1] Cylinder\n2]Cone\n3]Sphere\n4]Exit\nEnter your choice: ");
	scanf("%d", &ch);
	switch(ch)
	{
	case 1:	printf("\n\n\nEnter the radius and the height: ");
	scanf("%f %f", &r, &h);
	A = 2*3.14*r*h+2*3.14*r*r;
	V = 3.14*r*r*h;
	printf("\n\nThe area is %f and volume is %f", A, V);
	break;
	case 2:	printf("\n\n\nEnter the radius and the height: ");
	scanf("%f %f", &r, &h);
	A = 3.14*r*(r+sqrt(h*h+r*r));
	V = 3.14*r*r*h/3;
	printf("\n\nThe area is %f and volume is %f", A, V);
	break;
	case 3:	printf("\n\n\nEnter the radius: ");
	scanf("%f", &r);
	A = 4*3.14*r*r;
	V = A*r/3;
	printf("\n\nThe area is %f and volume is %f", A, V);
	break;
	}
	}
}

