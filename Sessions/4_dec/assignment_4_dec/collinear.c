#include<stdio.h>

int main()
{
    int x1,y1, x2, y2, x3, y3, col;

    printf("Enter X Y of 3 points(x1, y1, x2, y2, x3, y3) : ");
    scanf("%d %d %d %d %d %d", &x1, &y1, &x2, &y2, &x3, &y3 );

    col =  x1 * (y2-y3) + x2 * (y3-y1) + x3 * (y1-y2);

    if (col== 0)
        printf("Points are collinear. \n");
    else
        printf("Points are not collinear.\n");

    return 0;
}
