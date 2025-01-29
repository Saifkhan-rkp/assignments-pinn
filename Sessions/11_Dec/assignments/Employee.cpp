#include <bits/stdc++.h>

using namespace std;

class emp
{
private:
    char name[20];
    int age;
    float bs;

public:
    void read()
    {
        cout << "Enter name age bs: ";
        cin >> name >> age >> bs;
    }
    float getBS()
    {
        return (float)bs;
    }
    // float hra(){
    //     return bs * 0.15;
    // }
    // float da(){
    //     return bs *0.10;
    // }
    // float grossSalary()
    // {
    //     float gs;
    //     gs = bs + bs * 0.10 + bs * 0.15;
    //     return (float)gs;
    // }
    void write()
    {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Bs: " << (float)bs << endl;
    }
};

int main(int argc, char const *argv[])
{
    int i, count = 5;
    // float max, max2, max3;
    emp e[count], first, second, third;

    for (i = 0; i < count; i++)
    {
        e[i].read();
    }

    first = second = third = e[0];
    // max = e[0].getBS();
    for (i = 0; i < count; i++)
    {
        if (e[i].getBS() > first.getBS())
        {
            // max = e[i].getBS();
            third = second;
            // max3 = third.getBS();
            second = first;
            // max2 = second.getBS();
            first = e[i];
        }
        else if (e[i].getBS() > second.getBS())
        {
            /* code */
            third = second;
            second = e[i];
        }
        else if (e[i].getBS() > third.getBS())
        {
            third = e[i];
        }
    }

    cout << "\nTop three are :" << endl;
    first.write();
    second.write();
    third.write();

    return 0;
}