#include <iostream>

/**
 * define class emp with private data menmbers name, age, bs, along with the related member functions
 * using this class write a program which reads the name age bs of an employee calculates and displays the values of TA HRA and Gross salary
 * TA is 10% of bs
 * HRA is 15% of bs
 */

using namespace std;

class emp
{
private:
    char name[20];
    int age;
    float bs;

public:
    //     emp
    // (/* args */);
    //     ~emp
    // ();

    void read()
    {
        cout << "Enter name age bs: ";
        cin >> name >> age >> bs;
    }
    float retBS(){
        return bs;
    }
    float hra(){
        return bs * 0.15;
    }
    float da(){
        return bs *0.10;
    }
    float grossSalary()
    {
        float gs;
        gs = bs + bs * 0.10 + bs * 0.15;
        return (float)gs;
    }
    void write()
    {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Bs: " << bs << endl;
    }
};

int main(int argc, char const *argv[])
{
    emp e1;
    e1.read();
    e1.write();
    cout<<"HRA : "<<e1.hra()<<endl;
    cout<<"DA : "<<e1.da()<<endl;
    cout<<"Gross Salary: "<<e1.grossSalary()<<endl;
    return 0;
}


// grossSalary::grossSalary(/* args */)
// {
// }

// grossSalary::~grossSalary()
// {
// }

