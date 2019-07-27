#include<stdio.h>
int main()
{
  int n,t1=1,t2=0,next,i;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d ",t2);
    next=t1+t2;
    t2=t1;
    t1=next;
  }
  return 0;
}