#include<stdio.h>

int main(int argc, char const *argv[])
{
    int x, y, powX = 1, pow2=1, pow4=1;
    float s;
    printf("Enter x and y: ");
    scanf("%d %d", &x, &y);
    
    for (int i = 1; i <= y; i++)
        powX *= x;
    
    for (int i = 1; i <=6; i++)
        pow2 *=2;
    
    for (int i = 1; i <= x; i++)
        pow4 *= 4;

    s = (float)(powX*pow2)/pow4;
    
    
    printf("Value of S : %f", s);
    return 0;
}
