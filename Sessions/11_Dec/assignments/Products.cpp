#include <bits/stdc++.h>

using namespace std;

class Product
{
private:
    /* data */
    char *name;
    /* considering sp, cp as int insted float */
    int qty, sp, cp;

public:
    Product(char *nm, int qt, int sp1, int cp1)
    {
        name = nm;
        qty = qt;
        sp = sp1;
        cp = cp1;
    };
    // ~Products();

    int valueOfProd()
    {
        return cp * qty;
    }
    int totalProfit()
    {
        return qty * (sp - cp);
    }

    void display()
    {
        cout << "Product: " << name << endl;
        cout << "Quantity: " << qty << endl;
        // cout<<"Value: "<<valueOfProd()<<endl;
        // cout<<"Total Profit: "<<totalProfit();
    }
};

int main()
{
    /* code */
    Product p("Sugar", 10, 34, 28);

    p.display();
    cout << "Value: " << p.valueOfProd() << endl;
    cout << "Total Profit: " << p.totalProfit();

    return 0;
}
