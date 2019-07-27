#include <stdio.h>
int main()
{
  	int b,e,a=1,i;
  scanf("%d%d",&b,&e);
  if(e>=0)
  {
    for(i=1;i<=e;i++)
    {
      a=a*b;
    }
    printf("%d",a);
  }
  else
  {
    printf("Wrong input");
  }
    return 0;
}