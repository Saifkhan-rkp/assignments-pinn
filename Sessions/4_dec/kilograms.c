#include<stdio.h>

int main(int argc, char const *argv[])
{
    float kgs, grams;
    printf("Enter Grams : ");
    scanf("%f", &grams);

    // calculating grams to kilograms using '/' divide operator 
    // grams variable by dividing 1000 we get kilograms; asigning it to kgs variable
    kgs = grams/1000;

    printf("Kilograms : %f\n", kgs);

    return 0;
}
