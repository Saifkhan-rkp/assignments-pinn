#include<stdio.h>

int main(int argc, char const *argv[])
{
    int flag;
    for (int i = 1; i <= 1000; i++)
    {
        flag =0;
        for (int j = 2; j <= i/2; j++)
        {
            if (i%j==0)
            {
                flag=1;
                break;
            }
            
        }
        if (!flag)
        {
            printf("%d \n",i);
        }
    }
    
    return 0;
}
