#include<stdio.h>

int main()
{
  char str[100];
  int i, count=0;
  scanf ("%[^\n]s", str) ;
  for(i=0;str[i]!='\0';i++) 
  {
    if(str[i]==' ') 
    {
      count=count+1;
    }
  }
  count++;
  printf("%d", count) ;
  return 0;
}