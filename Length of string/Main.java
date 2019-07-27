#include<stdio.h>
#include<string.h>
int main()
{
  char str[50];
  int l;
  gets(str) ;
  l=strlen(str) ;
  printf("%d", l) ;
  return 0;
}