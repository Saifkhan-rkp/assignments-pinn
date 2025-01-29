#include<stdio.h>

int main(int argc, char const *argv[])
{
    int year;

    printf("Enter Year : ");
    scanf("%d", &year);

    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
    {
        printf("This is leap year");
    }
    else
    {
        printf("This is not leap year");
    }
    
    return 0;
}
