#include<stdio.h>

int main(int argc, char const *argv[])
{
    // declaring 5 vars and max var to store largest number
    int a, b, c, d, e, max;
    printf("Enter 7 nums. : ");
    scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);
    
    // initially setting max to variable 'a' as initial value to compare 
    max = a;

    //if conditions compares each variable to 'max' if that var is greater than max then that variable assigns to 'max'
    //each if conditions individual to each other 
    if (b> max) max=b;
    if(c>max ) max = c;
    if(d>max) max = d;
    if(e>max) max = e;
    
    printf("max num is : %d", max);

    return 0;
}

