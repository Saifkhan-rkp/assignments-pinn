#include<stdio.h>


int reverse(int i){
    int rev=0, d;
    while(i !=0){
        d = i%10;
        rev= rev*10+d;
        i /=10;
        // count++;
    }
    // rev = rev*10+count;
    return rev;
}

int main(int argc, char const *argv[])
{
    int num, count=0, d, i=1;
    printf("Enter No.: ");
    scanf("%d", &num);
    num = reverse(num);
    while (num != 0)
    {
        d = num%10;
        count = count*10+d;
        printf("%d \n", count);
        num /=10;
    }
    count /=10;
    while (count != 0)
    {
        printf("%d \n", count);
        count /=10;
    }
    return 0;
}
