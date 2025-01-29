

#include<iostream>

using namespace std;


class Account
{
private:
    /* data */
    char name[20];
    char type[20];
    int accNo;
    float balance;
public:
    void read(){
        int i;
        cout<<"Enter name type acc No. balance : ";
        cin>>name>>type>>accNo>>balance;
    }
    void write(){
        cout<<"Name : "<<name<< endl;
        cout<<"Acc No.: "<<accNo<<endl;
        cout<<"type: "<<type<<endl;
        cout<<"balance: "<<balance<<endl;
    }
    void withdrawal(float amt){
        if (amt<=balance)
        {
            balance -= amt;
            cout<<"Amount debited from account is Rs."<<amt<<" and current balance is Rs."<<balance<<endl;
        }else{
            cout<<"Insufficient Balance\n Your Current balance is Rs."<<balance<<endl;
        }
        
    }
    void deposit(float amt){
        if(amt>0){
            balance +=amt;
            cout<<"Amount credited to account is Rs."<<amt<<" and current balance is Rs."<<balance<<endl;
        }else
        {
            cout<<"deposit amount not to be negative.";
        }
        
    }
    // Account(/* args */);
    // ~Account();

};

int main(int argc, char const *argv[])
{
    /* code */
    Account a1;
    a1.read();
    a1.write();
    int amt;
    while (1)
    {
        /* code */
        char ch[1];
        cout<<"Enter your choice below(w,d or q to quit) \n1] Withdrawal \n2] Deposit \n3]Quit \nChoice: "<<endl;
        cin>>ch;
        if (ch[0]=='q')
        {
            break;
        }else if (ch[0] == 'w')
        {
            cout<<"Input amount: ";
            cin>>amt;
            a1.withdrawal(amt);
        }else if (ch[0]=='b')
        {
            cout<<"Input amount: ";
            cin>>amt;
            a1.deposit(amt);
        }else
        {
            cout<<"Not an Option";
        }          
    }
    
    return 0;
}


// Account::Account(/* args */)
// {
// }

// Account::~Account()
// {
// }
