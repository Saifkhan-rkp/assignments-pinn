#include<stdio.h>

int isBinary(int);

int main(int argc, char const *argv[])
{
    int num, flag;
    printf("Enter No.: ");
    scanf("%d", &num);
    flag = isBinary(num);
    if (flag)
    {
        printf("Binary");

    }else{
        printf("not binary");
    }
    

    return 0;
}

int isBinary(int num){
    int flag=1, d;
    while (num != 0)
    {
        d = num%10;
        // printf("%d", d!=0 || d!=1);
        if (d!=0 && d!=1)
        {
            flag = 0;
            break;
        }
        num /=10;
    }
    return flag;
}
