#include<iostream>
#include<string>
#include<cmath>
using namespace std;

//Converting a decimal number to equivalent binary number
void recursive_binary(int num,string &ans)
{
    if (num > 1)
    {
        recursive_binary(num/2,ans);
    }
    ans = ans + to_string(num%2);
}

//Binary to Decimal
int bin_to_dec(int bin_num)
{
    int decimal = 0;
    int i = 0;
    while(bin_num != 0)
    {
        int bit = bin_num % 10;
        decimal = decimal + bit*pow(2,i);
        i = i + 1;
        bin_num = bin_num / 10;
    }
    return decimal;
}

//Decimal to Binary for Floating point numbers
double dec_num_to_binary(double num)
{
    int intnum = int(num);
    double fltnum = num - intnum;
    string intbistr = "";
    recursive_binary(intnum,intbistr);
    string fltbistr = "";
    int i = -1;
    while (i != -10)
    {
        if(fltnum >= pow(2,i))
        {
            fltbistr+="1";
            fltnum = fltnum - pow(2,i);
        }
        else
        {
            fltbistr+="0";
        }
        i = i - 1;
    }
    string ans = intbistr+"."+fltbistr;
    return stod(ans);
}

//Binary to Decimal for Floating point numbers
double bin_to_dec(double num)
{
    int inte = (int)num;
    double flt = num - inte;
    inte = bin_to_dec(inte);
    string flts = to_string(flt);
    double fltpart = 0;
    for (int i = 0; i < flts.length() - 2; i++)
    {
        fltpart+=((int)flts[i+2] - 48)*pow(2,-(i+1));
    }
    return fltpart+inte;
}

//Addition and Subtraction of binary numbers
void AddSubtract()
{
    double num1,num2;
    cout << "Enter two numbers : ";
    cin >> num1 >> num2;
    double num1dec = bin_to_dec(num1);
    double num2dec = bin_to_dec(num2);
    cout << "Addition : "<< num1dec+num2dec;
    cout << "Subtraction : "<< num1dec-num2dec;
}

//Sample main class
int main()
{
    string ans = "";
    recursive_binary(25,ans);
    cout << ans << endl;
    
    cout << bin_to_dec(10010) << endl;

    cout << dec_num_to_binary(10.25) << endl;

    cout << bin_to_dec(1001.01) << endl;

    AddSubtract();
}