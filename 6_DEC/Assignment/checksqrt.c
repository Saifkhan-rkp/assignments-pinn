#include<stdio.h>
#include<math.h>

int checkSqrt(double sqr, int num){
    if (sqr == sqrt(num))
    {
        return 1;
    }
    else{
        return 0;
    }
    
}

int main(int argc, char const *argv[])
{
    int num2;
    double num1;

    printf("Enter 2 no. : ");
    scanf("%lf %d", &num1, &num2);

    if (checkSqrt(num1, num2))
    {
        printf("okay square root");
    }
    else
    {
        printf("not square root");
    }
    
    return 0;
}
