#include <stdio.h>  

int lengthOfLIS(int* nums, int numSize) 
{
    int arr[numSize];  

    for (int i = 0; i < numSize; i++) {
        arr[i] = 1;  // Each element is an increasing subsequence of length 1
    }

    int maxLength = 1;

    for (int i = 1; i < numSize; i++) {
        for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j]) {
                arr[i] = (arr[i] > arr[j] + 1) ? arr[i] : (arr[j] + 1);
            }
        }
        if (arr[i] > maxLength) {
            maxLength = arr[i];
        }
        
    }

    return maxLength;
}

int main() 
{
    int numSize;
    printf("Enter the size of the array: ");
    scanf("%d", &numSize);

    int nums[numSize];
    printf("Enter %d elements of the array:\n", numSize);
    for (int i = 0; i < numSize; i++) {
        scanf("%d", &nums[i]);
    }

    int result = lengthOfLIS(nums, numSize);

    printf("The length of the longest increasing subsequence is: %d\n", result);

    return 0;
}
