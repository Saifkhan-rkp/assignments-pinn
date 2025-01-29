#include<stdio.h>

int main(int argc, char const *argv[])
{
    int num, i, flag=0;
    printf("Enter No. :");
    scanf("%d", &num);

    for ( i = 2; i < num-1; i++)
    {
        if (num%i==0)
        {
            flag =1;
            break;
        }
        
    }
    // if (num == i)
    // {
    //     printf("Not Prime\n");
    // }
    
    if (flag)
    {
        printf("Not Prime\n");
    }else{
        printf("Prime\n");
    }
    
    
    return 0;
}
