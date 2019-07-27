#include<stdio.h>
int main()
{
  int n1, n2, min, i, lcm, gcd;
  scanf("%d%d", &n1, &n2) ;
  min=n1>n2? n1:n2;
  for(i=min;i>=1;i--) 
  {
    if((n1%i==0) &&(n2%i==0)) 
    {
      gcd=i;
      lcm =(n1*n2)/i;
      printf ("%d", lcm) ;
      break;
    }
  }
  return 0;
}