#include <stdio.h>
 
int main()
{
  int year;
 
  printf("Enter a year:");
  scanf("%d", &year);
 
  if ( year%400 == 0) 
    printf("yes");
  else if ( year%100 == 0) 
    printf("No");
  else if ( year%4 == 0 ) 
    printf("yes");
  else
    printf("No");
  return 0;
}
