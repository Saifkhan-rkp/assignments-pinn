#include<stdio.h>

int main()
{
    int a, b, c, d, e, f, g, max;
    printf("Enter 7 nums. : ");
    scanf("%d %d %d %d %d %d %d", &a, &b, &c, &d, &e, &f, &g);

    max = a;

    if (b> max) max=b;
    if(c>max ) max = c;
    if(d>max) max = d;
    if(e>max) max = e;
    if(f>max) max = f;
    if(g>max) max = g;
    
    printf("max num is : %d", max);
    return 0;
}
