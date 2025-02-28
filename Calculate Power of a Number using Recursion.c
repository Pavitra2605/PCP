#include <stdio.h>

int cal(int b,int p)
{
    if(p==0)
    return 1;
    return b*cal(b,(p-1));
}

int main()
{   
    int b,p;
    printf("Enter the value of base: ");
    scanf("%d",&b);
    printf(" Enter the value of power: ");
    scanf("%d",&p);
    printf("The value of %d power %d is: %d\n",b,p,cal(b,p));
    return 0;
}

