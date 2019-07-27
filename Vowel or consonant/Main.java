#include<stdio.h>
int main()
{
  //type your code here
  char c;
  scanf("%c",&c);
  if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||
     c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
  {
    printf("Vowel");
  }
  else
  {
    printf("Consonant");
  }
  return 0;
}