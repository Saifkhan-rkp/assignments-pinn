#include<stdio.h>

// int inputArray[](){
//     int a[10];
//     for (int i = 0; i < 10; i++)
//     {
//         printf("Enter Element %d : ", i);
//         scanf("%d", &a[i]);
//     }
// }

int summation(int a[]){
    int sum=0;
    for (int i = 0; i < 10; i++)
    {
        sum+=a[i];
    }
    return sum;
}


int sumOfSquare(int a[]){
    int sum =0;
    for (int i = 0; i < 10; i++)
    {
        sum+=a[i]*a[i];
    }
    return sum;
} 


int sumOfXY(int x[], int y[]){
    int sum=0;
        for (int i = 0; i < 10; i++)
    {
        sum+=x[i]*y[i];
    }
    return sum;
}


int main(int argc, char const *argv[])
{
    int x[10], y[10], i, n =10, sumX, sumY;
    float s;

    printf("Enter x ");
    for (i = 0; i < 10; i++)
    {
        printf("Enter %d : ", i);
        scanf("%d", &x[i]);
    }
    printf("Enter y ");
    for (i = 0; i < 10; i++)
    {
        printf("Enter %d : ", i);
        scanf("%d", &y[i]);
    }

    sumX = summation(x);
    sumY = summation(y);


    // printf("%d %d %d %d", sumX, sumY, sumOfXY(x,y), sumOfSquare(x));

    s = (float)(n * sumOfXY(x,y) - sumX*sumY)/(sumOfSquare(x) - (sumX*sumX));

    printf("Value of S : %f", s);

    return 0;

}