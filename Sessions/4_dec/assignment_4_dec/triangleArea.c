#include<stdio.h>
#include<math.h>

int main()
{
    float a, b, c, s;
    double area;
    printf("Enter sides of triangle (a, b, c): ");
    scanf("%f %f %f", &a, &b, &c);

    s = (a+b+c)/2;
    area = sqrt(s * (s-a) * (s-b) * (s-c));

    printf("Area of triangle : %lf", area);

    return 0;
}
