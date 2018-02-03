#include<stdio.h>

int main()
{
	char c;
	printf("Enter the Character:");
	scanf("%c",&c);
	if((c>='a' && c<='z') || (c>='A' && c<='Z'))
		printf("Alphabet");
	else
		printf("No");
return 0;
}
