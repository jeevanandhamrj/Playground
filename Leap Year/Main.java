#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%100==0)
  {
    if(n%400==0)
  printf("LEAP YEAR");
   else
   printf("NOT LEAP YEAR");
    }
  else if(n%4==0)
  {
  printf("LEAP YEAR");
  }
   else
   {
   printf("NOT LEAP YEAR");
   }
  return 0;
}