#include <stdio.h>

int main(void) {
	int sum=0,in;
	printf("enter the number:");
	scanf("%d",&in);
	for(int i=1;i<=in;i++)
	{
	    sum=sum+i;
	}
	printf("\n %d",sum);
	return 0;
}


