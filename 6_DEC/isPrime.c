#include<stdio.h>


int isPrime(int num){
    int flag = 1;
    for (int i = 2; i <= num/2; i++)
    {
        if (num %i == 0 )
        {
            flag =0;
            break;
        }
    }
    
    return(flag);
}


int main(int argc, char const *argv[])
{
    int flag;
    for (int i = 1; i <= 1000; i++){
        flag = isPrime(i);
        if (flag)
            printf("%d ", i);
        
    }
    return 0;
}
