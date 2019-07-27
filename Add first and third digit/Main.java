#include<stdio.h>
int main()
{
  int num, first, third, sum;
  scanf("%d", &num);
  first = num / 100;
  third = num % 10;
  sum = first + third;
  printf("%d", sum);
}