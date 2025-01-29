

// #include<iostream>
// #include<string>
#include<bits/stdc++.h>

using namespace std;

class Students
{
private:
    /* data */
    int rno;
    // char name[20];
    string name;
    int m1, m2, m3;

public:
    Students(){};

    //----------- 1 st ---------------
    Students(string nm, int rn, int mr1, int mr2, int mr3){
        name = nm;
        rno = rn;
        m1 = mr1;
        m2 = mr2;
        m3 = mr3;
    };
    // ~Students();
    //------------- 2nd -----------------
    void setData(string nm, int rn, int mr1, int mr2, int mr3){
        name = nm;
        rno = rn;
        m1 = mr1;
        m2 = mr2;
        m3 = mr3;
    }

    // ------------ 3rd ------------------
    void read()
    {
        cout << "Enter name and rno: ";
        cin >> name >> rno;
        cout << "enter Marks m1, m2, m3 : ";
        cin >> m1 >> m2 >> m3;
    }
    void write()
    {
        cout << "Name : " << name << endl;
        cout << "Roll No. : " << rno << endl;
        cout << "Marks : " << m1 << " " << m2 << " " << m3 << endl;
        cout<<"Percentage: "<< calPercentage()<<"%"<<endl;
        cout<<"Result: "<<result()<<endl;
    }
    float calPercentage(){
        return (float)(m1 +m2 +m3)/3;
    }
    string result(){
        string res;
        if (m1>34 && m2>34 && m3>34)
        {
            /* code */
            res = "Pass";
        }else{
            res = "Fail";
        }
        return res;
    }

};


int main(int argc, char const *argv[])
{
    Students s;
    // Students s("S1",2, 35, 35, 35), s1;
    // s1.setData("S6",5, 40, 38, 37);
    s.read();
    s.write();
    return 0;
}
