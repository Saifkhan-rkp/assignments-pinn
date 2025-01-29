#include<stdio.h>

int main(int argc, char const *argv[])
{
    float cel, fer;
    printf("Enter Degree celsius: ");
    scanf("%f", &cel);

    fer = cel + 32;

    printf("Fahrenheit is : %f", fer);

    return 0;
}
