// +-----------+          +-----------+
// |     a     |          |      c =0 |
// |     b     |          |           |
// |           |          |           |
// |           |          |           |
// +-----------+          +-----------+

// +-----------+
// |     a     |
// |     b     |
// |           |
// |           |
// +-----------+


// +-----------+
// |     a     |
// |     b     |
// |           |
// |           |
// +-----------+

#include<iostream>

using namespace std;


class statics
{
private:
    /* data */
    int a,b;
    static int c;
public:
    statics(int a1, int b1){
        a =a1;
        b =b1;
    }
    static void displayc(){
        cout<<c<<endl;
    }
    void display(){
        cout<<a<<" "<<b<<endl;
    }
    // statics(/* args */);
    // ~statics();
};

// statics::statics(/* args */)
// {
// }

// statics::~statics()
// {
// }

int main(int argc, char const *argv[])
{
    statics s1(10, 20), s2(30,40), s3(40,50);
    
    return 0;
}
