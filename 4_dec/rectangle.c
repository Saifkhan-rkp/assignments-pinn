#include<stdio.h>


int main(int argc, char const *argv[])
{
    // declared three float variables length measured in the decimals
    float length, breadth, area;
    
    // taking float values of variables from user 
    printf("Enter length and breadth : ");
    scanf("%f %f", &length, &breadth);
    
    // assigning variable area with area of rectangle l*b, * operator to multiply the two vars
    area = length* breadth;
    
    printf("Area of rectangle: %f \n", area);
    return 0;
}
