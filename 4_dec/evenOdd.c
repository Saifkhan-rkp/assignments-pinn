#include<stdio.h>

int main(int argc, char const *argv[])
{
    int num;

    // taking num integer variable from user input 
    printf("Enter No.: ");
    scanf("%d", &num);

    // checking if num is even or odd by taking mod '%' of num by 2 equals to zero
    // comparing the LHS and RHS using equality operator '=='  
    if (num % 2 == 0)
        printf("even"); // printing 'even' if condition is true
    else
        printf("odd"); // printing 'odd' if condition is false
    
    return 0;
}
