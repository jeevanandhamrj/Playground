#include<stdio.h>
#include<math.h>
int main()
{
  int n,sum=0,rem,p=0;
  scanf("%d",&n);
  while(n!=0)
  {
    rem=n%10;
    sum=sum+rem*pow(2,p);
     n=n/10;
    p++;
   }
  int a[100],i=0,j;
  while(sum!=0)
  {
    a[i++]=sum%8;
    sum=sum/8;
  }
  for(j=i-1;j>=0;j--)
  {
    printf("%d",a[j]);
  }
  return 0;
  
    
}