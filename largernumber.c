#include<stdio.h>
int main()
{
int a,b,c;
printf("Enter the number a,b,c:");
scanf("%d",&a);
scanf("%d",&b);
scanf("%d",&c);
if(a>b)
{
if(a>c)
{
printf("%d",a);
}
else
{
printf("%d",c);
}
}
else if(b>c)
{
printf("%d",b);
}
return 0;
}
