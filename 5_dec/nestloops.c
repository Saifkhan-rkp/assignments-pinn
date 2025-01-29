/**
 * 
 * Write a program which calculates and displays all values of z on user screen for x varying  from 1 -10 for each value of y
 * from 1-5 with an increment 0.5
 */

#include<stdio.h>

int main(int argc, char const *argv[])
{
    // we are taking x as an integer because it varying from 1 - 10 with increment of 1
    int x;
    float y, z;
    for (y = 1; y <= 5 ; y+=0.5)
    {
        for (x = 1; x <= 10; x++)
        {
            z = 3* x + 2 *y;
            printf("X= %d Y= %f Z= %f", x,y,z);
        }
        
    }
    
    return 0;
}
