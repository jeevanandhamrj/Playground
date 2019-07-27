#include<stdio.h>
int main()
{
  int num, first, third, sum;
  scanf("%d", &num);
  first = num /10;
  third = first %10;
  printf("%d", third);
}