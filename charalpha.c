#include<stdio.h>

int main()
{
	char c;
	printf("Enter the Character:");
	scanf("%c",&c);
	if((c>='a' && c<='z') || (c>='A' && c<='Z'))
		printf("%c is a alphabet",c);
	else
		printf("%c is not an alphabet",c);
return 0;
}
