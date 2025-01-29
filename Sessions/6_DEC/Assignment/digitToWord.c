#include<stdio.h>

char *digitToWord(int num){
    char *word;
    switch (num)
    {
    case 1:
        word = "one";
        break;
    case 2:
        word ="two";
        break;
    case 3:
        word ="three";
        break;
    case 4:
        word ="four";
        break;
    case 5:
        word ="five";
        break;
    case 6:
        word ="six";
        break;
    case 7:
        word ="seven";
        break;
    case 8:
        word ="eight";
        break;
    case 9:
        word ="nine";
        break;
    case 0:
        word ="zero";
        break;
    default:
        break;
    }
    return word;
}

int reverse(int i){
    int rev=0, d;
    while(i !=0){
        d = i%10;
        rev= rev*10+d;
        i /=10;
    }
    return rev;
}


int main(int argc, char const *argv[])
{
    int num, d;
    char word;
    printf("Enter No.: ");
    scanf("%d", &num);
    num = reverse(num);

    while (num!=0)
    {
        d = num%10;
        printf("%s ", digitToWord(d));
        num /=10;
    }
    return 0;
}


