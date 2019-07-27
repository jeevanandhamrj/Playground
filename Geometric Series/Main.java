#include<stdio.h>
#include<math.h>
int main()
{
  int n,n1,n2,a,r,gp;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=1,r=2;
    n1=(n+1)/2;
    gp=a*pow(r,n1-1);
    printf("%d",gp);
  }
  else
  {
    a=1,r=3;
    n2=n/2;
    gp=a*pow(r,n2-1);
    printf("%d",gp);
  }
  return 0;
}