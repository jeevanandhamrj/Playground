// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int num1,num2,small,i;
  scanf("%d%d",&num1,&num2);
  small=num1>num2?num2:num1;
  for(i=small;i>=-1;i--)
  {
    if(num1%i==0 && num2%i==0)
    {
      printf("%d",i);
      break;
    }
  }
  
   return 0;
}