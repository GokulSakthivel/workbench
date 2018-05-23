#include <stdio.h>

int main(void) {
	int total=0,in;
	printf("enter the number:");
	scanf("%d",&in);
	for(int i=1;i<=in;i++)
	{
	    total=total+i;
	}
	printf("\n %d",total);
	return 0;
}


