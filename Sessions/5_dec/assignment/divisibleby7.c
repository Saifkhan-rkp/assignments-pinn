#include<stdio.h>

int main(int argc, char const *argv[])
{
    int sum =0;

    for (int i = 7; i < 1000; i++)
    {
        if (i%7==0)
        {
            sum += i;
        }
        
    }
    
    printf("Sum of no. divisible by 7 : %d \n", sum);
    return 0;
}
