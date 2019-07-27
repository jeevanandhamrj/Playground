#include<stdio.h>
int main()
{
  int num, first, third,x;
  scanf("%d", &num);
  first = num %10;
  third = num /10;
  x=first+third;
  printf("%d", x);
}