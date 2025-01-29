#include<stdio.h>


int isLeapYear(int yr){
    if (yr % 400 == 0 || (yr % 4 == 0 && yr % 100 != 0))
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
// int main(int argc, char const *argv[])
// {
//     int year;

//     printf("Enter Year : ");
//     scanf("%d", &year);

//     printf("is Leap - %d", isLeapYear(year));
//     return 0;
// }
