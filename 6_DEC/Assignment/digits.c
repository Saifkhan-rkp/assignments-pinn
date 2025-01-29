#include<stdio.h>

int main(int argc, char const *argv[])
{
    int num, d,sum=0;
    printf("Enter No.: ");
    scanf("%d", &num);
    while (num!=0)
    {
        d =num%10;
        num /=10;
        sum+=d;
    }
    printf("digit count : %d", sum);
    return 0;
}
