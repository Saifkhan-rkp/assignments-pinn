#include <bits/stdc++.h>
#include <iostream>
#include "string.h"
using namespace std;


class Cricketer
{
private:
    /* data */
    // char *name;
    // char *teamName;
    char  name[20];
    char teamName[20];

public:
    int runs;
    Cricketer(/* args */){};
    Cricketer(char* nm, char* tn, int rn){
        strcpy(name,nm);
        //name = nm;
        strcpy(teamName ,tn);
        runs = rn;
    };
    // ~Cricketer();

    void setData(char* nm, char* tn, int rns){
        strcpy(name,nm);
        strcpy(teamName,tn);
        // name = nm;
        // teamName = tn;
        runs = rns;
    }

    void display(){
        cout<<"Name: "<<name<<endl;
        cout<<"Team Name: "<<teamName<<endl;
        cout<<"Runs: "<<runs<<endl;
    }
};


int main(int argc, char const *argv[])
{
    // Cricketer c100s[100];
    Cricketer c100s[5], top;

    // c1.setData("Raju", "CSK", 234);
    // c2.setData("Shyam", "MI", 543);

    // c1.display();
    // c2.display();    
    int i, runs, nRuns;

    char name[20], teamName[20];
    for (i = 0; i < 2; i++)
    {
        /* code */
        cout<<"Enter "<<i+1<<" Cricketer Name :";
        cin>>name;
        cout<<"Team name: ";
        cin>>teamName;
        cout<<"Runs: ";
        cin>>runs;
        c100s[i].setData(name, teamName, runs);
    }
    // nRuns = c100s[0].runs;
    // top = c100s[0];
    cout<<"\nEnter N runs: ";
    cin>>nRuns;
    for (i = 0; i < 2; i++){
        if (c100s[i].runs>=nRuns)
        {   
            c100s[i].display();
        }
    }
    // cout<<"\nTop Cricketer is : "<<endl;
    // top.display();
    

    return 0;
}


