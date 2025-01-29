#include<stdio.h>

int main(int argc, char const *argv[])
{
    struct emp
    {
        char name[20];
        int age;
        float bs;
    };
    struct emp e[10];
    struct emp temp;
    int i;
    for (i = 0; i < 10; i++)
    {
        printf("Enter name age, salary");
        fgets(e[i].name, 20, stdin);
        scanf("%d %f", e[i].age, e[i].bs);
    }
    float max = e[0].bs;
    temp = e[0];

    for ( i = 0; i < 10; i++)
    {
        if (max < e[i].bs)
        {
            max = e[i].bs;
            temp = e[i];
        }
        
    }

    printf("%s %d %f", temp.name, temp.age, temp.bs);
    
    return 0;
}
