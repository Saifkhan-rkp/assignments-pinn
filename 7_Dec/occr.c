#include<stdio.h>

int main(int argc, char const *argv[])
{
    int a[15], n, i, count=0;

    for ( i = 0; i < 15; i++)
    {
        printf("Enter Element %d : ", i);
        scanf("%d", &a[i]);
    }
    printf("Enter n: ");
    scanf("%d", &n);

    for ( i = 0; i < 15; i++)
        if (n == a[i])
            count++;


    printf("Total count of n is : %d", count);
    
    return 0;
}