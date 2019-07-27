#include<stdio.h>
int isVowel(char c)
{
  int i;

  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
  {
    return 0;
  }
  else
  {
    return 1;
  }
}

  
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
 int i;
  for(i=0;str[i]!='\0';i++)
  {
    if(isVowel(str[i]))
    {
      printf("%c",str[i]);
    }
  }
  
  return 0;
}