/*
Team Rakshak : Controls and Communications Subsystem 
This code file contains the solution for the first problem of Task 3.
This problem is solved directly using Functions instead of Object Oriented Programming
 */
#include<iostream>
#include<cmath>
#include<cfloat>
#include<algorithm>
using namespace std;

//Function that prints polynomial
void printPoly(double arr[],int degree)
{
    for (int i = degree; i >= 0; i--)
    {
        if (arr[i]>=0)
        {
            cout << "+";
        }
        //if(arr[i] == 0)
            //continue;
        cout << arr[i] << "*(x^"<<i<<") ";
    }
    cout << endl;
}

//Function that evaluates the Polynomial at a given point.
double f(double x, double arr[],int degree)
{
    double answer = 0.0;
    for (int i = 0; i <= degree; i++)
    {
        answer = answer + pow(x,i)*arr[i]; 
    }
    return answer;
}

//Function that calculates the derivative of given polynomial
void derivative(double arr[],int degree)
{
    double deri[50];
    for (int i = 1; i <= degree ; i++)
    {
        deri[i-1] = arr[i]*i;
    }
    printPoly(deri,degree-1);
}

//Function that Evaluates Minimum and Maximum of Polynomial in a Interval
void MinMax(double arr[],double lower,double upper,int degree)
{
    double min = DBL_MAX,max = DBL_MIN;
    double val;
    for(double i = lower;i <= upper; i=i+0.001) //Resolution of 0.001 on X-axis
    {
        val = f(i,arr,degree);
        if (val > max)
        {
            max = val;
        }
        if(val < min)
        {
            min = val;
        }
    }
    cout << "Minimun in given range : "<<min<<endl;
    cout << "Maximum in given range : "<<max<<endl;
}
//Finding Roots using Newton-Raphson method
double FindRoots(double arr[],double degree,double x)
{
    double deri[50];
    //First calculate derivative array at any general (x,f(x))
    for (int i = 1; i <= degree ; i++)
    {
        deri[i-1] = arr[i]*i;
    }
    double slope,xinter;
    while(f(x,arr,degree) > 0.000001)
    {
        //Calculate slope at x
        slope = f(x,deri,degree-1);
        xinter = (slope*x - f(x,arr,degree))/slope;
        x = xinter;
    }
    return x;
}

int main()
{
    int degree;
    cout << "Enter the degree of Polynomial : ";
    cin >> degree;
    double arr[50];
    
    //Enter the value of coefficients from lowest degree to highest degree 
    for(int i = 0;i < degree+1;i++)
    {
        cin >> arr[i];
    }
    printPoly(arr,degree);

    //Finding the value of Polynomial at a point
    double x;
    cout << "Enter a Number at which Value of Polynomial is needed : ";
    cin >> x;
    cout << endl << "Value of Polynomial at " << x << " is "<< f(x,arr,degree)<< endl;

    //Finding the derivative of Polynomial
    cout << "Derivative of Polynomial is ";
    derivative(arr,degree);

    //Finding Minimum and Maximum of polynomial in given Interval
    double lower_lim,upper_lim;
    cout << "Enter Lower limit and Upper Limit respectively : "; 
    cin >> lower_lim >> upper_lim;
    cout << endl;
    MinMax(arr,lower_lim,upper_lim,degree);

    //Finding the roots by Newton-Raphson Method
    cout << "Enter a number around which you would like to Find a root : ";
    cin >> x;
    double root = FindRoots(arr,degree,x);
    cout << endl << "Root of Polynomial is : "<< root;

}