#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b,c,r1,r2,real,img,d;
  scanf("%f%f%f",&a,&b,&c);
  d = ((b*b) - (4*a*c));
  if(d>0)
  {
    r1 = (-b + sqrt(d))/(2*a);
    r2 = (-b - sqrt(d))/(2*a);
    printf("root1 = %0.2f  root2 = %0.2f",r1,r2);
  }
  else if(d == 0)
  {
    r1=r2=(-b/(2*a));
    printf("root1 = %0.2f  root2 = %0.2f",r1,r2);
  }
  else
  {
    real = (-b/(2*a));
    img = sqrt(-d)/(2*a);
    printf("root1 = %0.2f + %0.2fi  root2 = %0.2f - %0.2fi ",real,img,real,img);
}
  return 0;
}