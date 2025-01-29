#include<iostream>

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

    void read(){
        cout<<"Enter name age bs: ";
        cin>>name>>age>>bs;
    }
    void write(){
        cout<<"Name: "<<name<<endl;
        cout<<"Age: "<<age<<endl;
        cout<<"Bs: "<<bs<<endl;
    }
};

class student
{
private:
    /* data */
    int rno;
    char name[20];
    int m1, m2, m3;
public:
    void read(){
        cout<<"Enter name and rno: ";
        cin>>name>>rno;
        cout<<"enter Marks m1, m2, m3 : ";
        cin>>m1>>m2>>m3;
    }
    void write(){
        cout<<"Name : "<<name<<endl;
        cout<<"Roll No. : "<<rno<<endl;
        cout<<"Marks : "<<m1<< " "<<m2<<" "<<m3<<endl;
    }
    // student(/* args */);
    // ~student();
};

// student::student(/* args */)
// {
// }

// student::~student()
// {
// }



int main(int argc, char const *argv[])
{
    // emp e1, e2;
    // e1.read();
    // e2.read();
    // e1.write();
    // e2.write();
    student s1, s2;
    s1.read();
    s2.read();
    s1.write();
    s2.write();
    return 0;
}



// emp::emp(/* args */)
// {
// }

// emp::~emp()
// {
// }
// 
