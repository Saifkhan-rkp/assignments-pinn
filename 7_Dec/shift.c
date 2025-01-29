#include<stdio.h>

int main(int argc, char const *argv[])
{
    int a[10], i, shift, last;

    for ( i = 0; i < 10; i++)
    {
        printf("Enter Element %d : ", i);
        scanf("%d", &a[i]);
    }

    last = a[9];
    for ( i = 9; 0 < i; i--)
        a[i] = a[i-1];
    
    a[0] = last;
    for ( i = 0; i < 10; i++)
        printf("%d ", a[i]);


    shift = a[0];
    for (i = 0; i < 10; i++)
        a[i] = a[i+1];
    
    a[9]= shift;

    for ( i = 0; i < 10; i++)
        printf("%d ", a[i]);

    
    return 0;
}