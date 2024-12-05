#include<iostream>

using namespace std;

class Employee{
    private:
        int hours;
        float rate;
        static int count;

    public:
        Employee(): Employee(90,70){     // parameter less constructor
            // this(90,70);    // calls the paramterized constructor of same class
        }

        Employee(int hours,float rate){
            this->hours = hours;
            this->rate = rate;
            count++;
        }


        // virtual function helps in dynamic binding
        // we cant override virtual functions in subclass
        virtual double GetNetIncome(){
            return hours*rate;
        }

        void setHoursAndRate(int hours,float rate){
            cout<<(int*) this<<endl;
            this->hours = hours;
            this->rate= rate;
        }

        // implicitly compiler does the binding by default it passes 
        // the reference of object as parmater and then the later paramters
        // void setHoursAndRate(Employee* this , int hours , float rate)

        static int GetCount(){
            return count;
        }
};

int Employee::count = 0;

class SalesPerson : public Employee{
    private:
        double sales;
    public:
        SalesPerson(int hours,float rate,double sales) : Employee(hours,rate){
            // super(hours,rate); -> JAVA
            this->sales= sales;
        }

        double GetSales(){
            return sales;
        }

        double GetNetIncome(){
            double income = Employee::GetNetIncome();
            income += sales / 10;
            return income;
        }
};

double Tax(Employee* emp){
    double income = emp->GetNetIncome();
    return income/10;
}

double GetTotalIncome()

int main(void){
    // Employee e; // this makes object in stack with limited space

    Employee* e = new Employee(100,110); // objects made in heap with unlimited space

    // Accessing private Members using pointers
    // int* iptr = (int*)e;
    // *iptr = 100;
    // float* ftpr = (float*)(iptr+1);
    // *ftpr = 210; 

    // e->setHoursAndRate(10,10000);
    cout<<"Income of employee "<<e->GetNetIncome()<<endl;
    cout<<"Tax of Employee is "<<Tax(e)<<endl;




    Employee* s = new SalesPerson(100,110,80000); // implicit upcasting
    // If GetNetIncome is not virtual in super class it will call method of its super class
    // cout<<"Income of SalesPerson "<<s->GetNetIncome()<<endl; 
    
    SalesPerson* s1 = (SalesPerson*)s; // explicit downcasting
    cout<<"Income of SalesPerson "<<s1->GetNetIncome()<<endl;
    
    
    cout<<"Tax of SalesPerson is "<<Tax(s1)<<endl;
    // cout<<"Tax of SalesPerson is "<<Tax(s)<<endl; // this works too
    
    
    
    cout<<"Total Count "<<Employee::GetCount()<<endl;
    // When a method is declared static the compiler doesnt bind the reference of class as paramter
    // thats why we dont requrie objects to call static method 

    Employee** employees = new Employee*[4];
    employees[0] = new Employee(100,180);
    employees[1] = new SalesPerson(100,180,80000);
    employees[2] = new SalesPerson(120,200,70000);
    employees[3] = new Employee(120,200);
    
    

    delete e;
    delete s;
    delete s1;
}