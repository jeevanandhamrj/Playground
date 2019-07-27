#include<stdio.h>
int main()
{
  float hyp,adj,opp;
  scanf("%f%f",&adj,&opp);
  hyp=sqrt((adj*adj)+(opp*opp));
  printf("%0.2f",hyp);
  return 0;
}