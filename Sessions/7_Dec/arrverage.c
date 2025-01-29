#include<stdio.h>

int main(int argc, char const *argv[])
{
    int a[10], i, sum=0;

    for ( i = 0; i < 10; i++)
    {
        printf("Enter Element %d : ", i);
        scanf("%d", &a[i]);
    }
    for ( i = 0; i < 10; i++)
    {
        sum +=a[i];
    }
    float avg = sum/10.0;

    printf("Average is : %f", avg);
    return 0;
}
