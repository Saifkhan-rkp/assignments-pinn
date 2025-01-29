#include<stdio.h>

int main(int argc, char const *argv[])
{
    for (int i = 0; i < 20; i++)
    {

        
        for (int j = 0; j < 8; j++)
        {
            if (i%2==0 && j%2 == 0)
            {
                printf("1 ");
            } else if (i%2!=0 && j%2 != 0)
            {
                printf("1 ");
            }
            else
            {
                printf("0 ");
            }
        }
        printf("\n");
        
    }
    
    return 0;
}
