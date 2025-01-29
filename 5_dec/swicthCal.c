#include<stdio.h>

int main(int argc, char const *argv[])
{
    int num1, num2;
    char opr,ch;
    float res;
    printf("Enter Two num : ");
    scanf("%d %d", &num1, &num2);
    // fflush(stdout);
    printf("Enter operator(*,/,+,-) : ");
    scanf("%*c%c", &opr);

switch (opr)
{
case '+':
    res = num1+num2;
    break;
case '-':
    res = num1-num2;
    break;
case '/':
    res = (float) num1/num2;
    break;
case '*':
    res = num1*num2;
    break;
default:
    printf("Invalid operator ");

    break;
}

printf("Res = %f ", res);

    return 0;
}
