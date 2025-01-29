#include<stdio.h>
#include<math.h>

int main(int argc, char const *argv[])
{
    int year;
    float amount, finalAmt;

    printf("Enter amount and year : ");
    scanf("%f %d", &amount, &year);

    finalAmt = amount * pow(1.13, year);

    printf("Final Amount : %lf\n", finalAmt); 

    return 0;
}
