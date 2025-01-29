#include<stdio.h>

int lastDate(int mon, int yr){
    int lastdate;
    if((mon<8 && mon%2!=0)||(mon>7 && mon%2 ==0)){
        lastdate = 31;
        
    }else{

        if (mon==2 && yr % 400 == 0 || (yr % 4 == 0 && yr % 100 != 0))
        {
            lastdate = 29;
        }else if (mon == 2)
        {
            lastdate =28; 
        }else{
            lastdate =30;
        }
        
        
    }
    return lastdate;
}


int main(int argc, char const *argv[])
{
    int mon, yr;
    printf("Enter month year: ");
    scanf("%d %d", &mon, &yr);

    printf("Last Date : %d", lastDate(mon, yr));
    return 0;
}

