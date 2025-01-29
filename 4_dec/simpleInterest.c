#include<stdio.h>

// saicompusyspankaj@gmail.com

int main()
{
    int year, interest = 13;
    float amount, finalAmt;

    printf("Enter amount and year : ");
    scanf("%f %d", &amount, &year);


    // using if else condition for checking if amount is less than '<' 10000 then interest rate must be 13% otherwise 18%
    // when if condition satisfies then only if blocks code get executed otherwise else blocks code will executes 
    if (amount<10000)
    {
        finalAmt = amount + year * 0.13 * amount;
    }
    else
    {
        finalAmt = amount + year * 0.18 * amount;
    }
    
    // finalAmt = year * (interest * amount)/100;
    // finalAmt += amount;

    // finalAmt = amount + year * (amount<10000? 0.13 : 0.18) * amount;

    printf("Final Amount : %f\n", finalAmt); 

    return 0;
}
