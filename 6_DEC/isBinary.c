#include<stdio.h>

int main(int argc, char const *argv[])
{
    int num, d, flag=1;
    printf("Enter No.: ");
    scanf("%d", &num);
    while (num != 0)
    {
        d = num%10;
        // printf("%d", d!=0 || d!=1);
        if (d!=0 && d!=1)
        {
            flag = 0;
            printf("Not Binary");
            break;
        }
        num /=10;
    }

    if (flag)
    {
        printf("It is Binary");
    }
        
    return 0;
}
