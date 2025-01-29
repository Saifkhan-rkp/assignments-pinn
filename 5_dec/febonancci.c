#include<stdio.h>

int main(int argc, char const *argv[])
{
    int n1=0, n2 =1, n3, i=2, num;
    printf("Enter num : ");
    scanf("%d", &num);
    if (num >= 1)
    {
        printf("%d ", n1);
    }
    if (num >= 2)
    {
        printf("%d ", n2);
    }
    if (num < 3) 
        return 0;

    while (num>i++)
    {
        n3 = n1 + n2;
        printf("%d ", n3);
        n1 = n2;
        n2 = n3;
    }
    
    return 0;
}