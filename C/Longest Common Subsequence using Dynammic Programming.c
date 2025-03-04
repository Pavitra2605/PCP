#include <stdio.h>
#include <string.h>

int LCS(char a[], char b[]) {
    int m = strlen(a);
    int n = strlen(b);

    // Create a 2D array to store lengths of LCS
    int dp[m + 1][n + 1];

    // Initialize the dp array
    for (int i = 0; i <= m; i++) {
        for (int j = 0; j <= n; j++) {
            // If either string is empty, LCS length is 0
            if (i == 0 || j == 0) {
                dp[i][j] = 0;
            } else if (a[i - 1] == b[j - 1]) {
                // If characters match, add 1 to previous diagonal value
                dp[i][j] = dp[i - 1][j - 1] + 1;
            } else {
                // If no match, take the maximum of left and top cell
                dp[i][j] = (dp[i - 1][j] > dp[i][j - 1]) ? dp[i - 1][j] : dp[i][j - 1];
            }
        }
    }

    // Return the length of the LCS
    return dp[m][n];
}

int main() {
    char a[] = "babbab";
    char b[] = "abaaba";

    int length = LCS(a, b);

    printf("Length of Longest Common Subsequence: %d\n", length);

    return 0;
}
