# include <stdio.h>
void greedy(int coins[],int l,int a)
{
    for(int i=0; i<l; i++)
    {
        while(a>=coins[i])
        {
            a=a-coins[i];
            printf("%d ",coins[i]);
        }
    }
}
int main()
{
    int a;
    int coins[]={25,10,5,1};
    printf("Enter the amount:");
    scanf("%d",&a);
    int l=sizeof(coins) / sizeof(coins[1]);
    greedy(coins,l,a);
    return 0;
    
    
}

