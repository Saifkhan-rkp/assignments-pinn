#include<stdio.h>

int main(int argc, char const *argv[])
{
    // creating 4 variable, were p and i is initialized with 1; p is to multiply to calculate power and is for loop
    int x, y, p = 1, i =1;
    printf("Enter x to the power y : ");
    scanf("%d %d", &x ,&y);
    // applying condition in while statement i is lessthan equal to y  
    while (i<=y)
    {
        // calculating power of x using p var
        p = p * x;
        printf("%d \n", p);
        i++;
    }
    
    printf("X to power Y is : %d ", p);
    
    return 0;
}
