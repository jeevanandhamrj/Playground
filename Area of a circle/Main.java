#include<stdio.h>
int main()
{
  int d;
  float area, r;
  scanf("%d", &d) ;
  r =(float)d/2;
  area=3.14*r*r;
  printf("%.2f", area) ;
  return 0;
}