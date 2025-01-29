
#include<iostream>

using namespace std;


class base
{
private:
    /* data */
    int data;
public:
    base(){

    };
    base(int d){
        data = d;
    }

    void display(){
        cout<<"Base : "<<data<<endl;
    }

    int calc(int add){
        return data+add;
    }
    int calc(int add, int mul){
        return (data + add)*mul;
    }

};
