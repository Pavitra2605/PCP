# include<stdlib.h>

int compare(const void *a,const void *b)
{
    return(*(int *)a - *(int *)b);
}

int main() {
    int arr[]={5,7,90,33,22};
    int size=sizeof(arr) / sizeof(arr[0]);
    qsort(arr,size,sizeof(int),compare);
    
    printf("Sorted Array:");
    for(int i=0; i<size; i++)
    {
        printf("%d ",arr[i]);
    }
}

