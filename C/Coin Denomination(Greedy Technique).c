#include <stdio.h>

void findChange(int denominations[],int size,int amount)
{
    printf("Change for Rs.%d/- using minimum coins/notes:\n-------------------------------------------------\n", amount);
    
    for(int i=0; i<size; i++)
    {
        if(amount >= denominations[i])
        {
            int count=amount / denominations[i];
            amount -= count*denominations[i];
            printf("Rs.%d x %d\n", denomnations[i], count);
        }
    }
    
    if(amount > 0)
           printf("Remaining amount: Rs.%d (Cannot be given using availabe denominations)\n", amount);
}
    int main()
    {
        int denominations[]={2000,500,200,100,50,20,10,5,2,1};
        int size = sizeof(denominations) / sizeof(denominations[0]);
        int amount;
        printf("Enter the amount: ");
        scanf("%d",&amount);
        findChange(denominations,size,amount);
        return 0;
    }
    
}
