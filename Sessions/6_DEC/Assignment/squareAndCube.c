#include<stdio.h>


int square(int);
int cube(int);

int main(int argc, char const *argv[])
{
    for (int i = 1; i <= 10; i++)
    {
        printf("No.: %d Square: %d Cube: %d \n", i, square(i), cube(i));
    }
        
    return 0;
}

int square(int num){
    return num*num;
}

int cube(int num){
    return num*num*num;
}