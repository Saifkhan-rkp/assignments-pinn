#include<stdio.h>

int main(int argc, char const *argv[])
{
    int prNo, qty, total = 0;
    printf(" 1. Harddisk 2600\n2. Monitor 5000\n3. Chair 6000\n4. Bag 1100");
    printf("\n5. Tab 8000\n6. Uniform 1200\n7. watch 4000\n8. Exit");
    while (1)
    {
        printf("\nEnter Product No.: ");
        scanf("%d", &prNo);
        // if (prNo == 8)
        // {
        //     printf("Total Amount : %d",total);
        //     break;
        // }
        printf("\nEnter Quantity: ");
        scanf("%d", &qty);

        switch (prNo)
        {
        case 1:
            total = total + qty * 2600;
            break;
        case 2:
            total = total + qty * 5000;
            break;
        case 3:
            total = total + qty * 6000;
            break;
        case 4:
            total = total + qty * 1100;
            break;
        case 5:
            total = total + qty * 8000;
            break;
        case 6:
            total = total + qty * 1200;
            break;
        case 7:
            total = total + qty * 4000;
            break;
        case 8:
            printf("Total Amount : %d",total);
            exit(0);
            break;
        default:
            printf("\nInvalid Option.. please reenter");
            break;
        }
    }
    
    // scanf("%d %d", &prNo, &qty);
    return 0;
}
