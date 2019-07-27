#include<stdio.h>
int main()
{
  float r,angle,len;
  scanf("%f%f",&r,&angle);
  len = 2*3.14*r*(angle/360);
  printf("%0.2f",len);
  return 0;
}