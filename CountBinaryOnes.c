#include <stdio.h>

int main() {
    int i = 0, n;
    scanf("%d", &n);
    int ones = 0;
    while(n != 0) {
        if(n%2 == 1) {
            ones++;
        }
        n /= 2;
    }
    if(ones > 0) {
        printf("Number of Ones in number is %d\n", ones);
    }
    else {
        printf("Invalid Input!...\n");
    }
    return 0;
}
