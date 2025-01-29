#include<stdio.h>

int main(int argc, char const *argv[])
{
    for (int i = 0; i < 26; i++)
    {
        for (int j = 0; j < i+1; j++)
        {
            printf("%c ", 97+i);
        }
        printf("\n");
    }
    
    return 0;
}
