#include <bits/stdc++.h>

using namespace std;

class BloodDonor
{
private:
    /* data */
    // name addr age bg
    string name;
    string addr;
    int age;
    string bg;

public:
    int getAge()
    {
        return age;
    }
    string getBG()
    {
        return bg;
    }
    void setData(string nm, string adr, int ag, string bgrp)
    {
        name = nm;
        addr = adr;
        age = ag;
        bg = bgrp;
    }

    void display()
    {
        cout << "Name: " << name << endl;
        cout << "Addr: " << addr << endl;
        cout << "Age: " << age << endl;
        cout << "Blood Grp: "<<bg<<endl;
    }
    // BloodDonor(/* args */);
    // ~BloodDonor();
};

int main(int argc, char const *argv[])
{
    /* code */
    // BloodDonor bd[100];
    string name, addr, bg;
    int i, age, count=5;

    BloodDonor bd[count];
    for (i = 0; i < count; i++)
    {
        /* code */
        cout << "Enter " << i + 1 << " Donor Name :";
        cin >> name;
        cout << "Addr: ";
        cin >> addr;
        cout << "Age: ";
        cin >> age;
        cout << "blood Grp: ";
        cin >> bg;
        bd[i].setData(name, addr, age, bg);
    }

    for ( i = 0; i < count; i++)
    {
        /* code */
        if (bd[i].getAge()<30 && bd[i].getBG()=="AB")
        {
            /* code */
            bd[i].display();
        }
        
    }
    
    return 0;
}
