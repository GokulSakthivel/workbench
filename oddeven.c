#include <stdio.h>

int main(void) {
	int a;
	printf("Enter the number :");
	scanf("%d",&a);
	if(a%2!=0)
	{
		printf("\n The Given Number is a odd Number");
	}
	else
	{
		printf("\n The Given Number is a even Number");
	}
	return 0;
}

