#include<stdio.h>
int main()
{
  	int n, e1, e2, ind1=-1, ind2=-1, i;
  scanf("%d", &n) ;
  int a[n];
  for(i=0;i<n;i++) 
  {
    scanf("%d", &a[i]) ;
  }
  scanf("%d%d", &e1, &e2) ;
  for(i=0;i<n;i++) 
  {
    if((a[i]==e1) &&(ind1==-1)) 
    {
      ind1=i;
    }
    if((a[i]==e2) &&(ind2==-1)) 
    {
      ind2=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d", ind1, ind2) ;
  return 0;
}