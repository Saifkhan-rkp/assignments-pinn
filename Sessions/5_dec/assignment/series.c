#include<stdio.h>

int main(int argc, char const *argv[])
{
      int n1=0, n2 =1, n3, p = 2, n;
    printf("Enter n: ");
    scanf("%d", &n);

    if (n >= 1)
    {
        printf("%d ", n1);
    }
    if (n >= 2)
    {
        printf("%d ", n2);
    }
    
    if(n > 2){
        for (int i = 1; i <= n-2; i++)
        {
            n3 = n2 + p;
            printf("%d ", n3);
            n2 = n3;
            p *= 2;

        }
    }
    
    return 0;
}
