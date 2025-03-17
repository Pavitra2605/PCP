
#include <stdio.h>
# define MAX 20

int dp[MAX];

int fact(int n){
    if(n == 0 || n == 1)
    return 1;
    dp[0]=1;
    dp[1]=1;
    dp[n]=n*fact(n-1);
    return n*fact(n-1);
    return dp[n];
}

int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d",&n);
    for(int i=0; i<MAX; i++)
    {
        dp[i] =-1;
    }
    printf("The value of %d factorial is %d.",n,fact(n));
    printf("\n%d %d",dp[0],dp[4]);
}
