#include<stdio.h>

int main(int argc, char const *argv[])
{
    /**
     * 1 2 3 4 5
     * 1 2 3 4 5
     * 1 2 3 4 5
     * 1 2 3 4 5
     */

    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            printf("%d ", j+1);
        }
        printf("\n");
    }
    
    printf("\n \nii) \n");

    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%d ", j);
        }
        printf("\n");
    }
    printf("\n \niii) \n");

    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%c ", 64+j);
        }
                printf("\n");

    }

    printf("\n \niv) \n");

    for (int i = 1; i <=5 ; i++)
    {
        for (int j = 1; j <= 6-i; j++)
        {
            printf("%d ", j);
        }
        printf("\n");
    }
    
    
    return 0;
}
