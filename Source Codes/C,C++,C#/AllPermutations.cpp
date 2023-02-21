#include<iostream>
#include<algorithm>
using namespace std;
void swap(char &a,char &b)
{
    char t = a;
    a = b;
    b = t;
}
int findCeil(char arr[],char first,int l,int n)
{
    int ceilIndex = l;
    for(int i = l+1 ; i<n ; i++)
    {
        if(arr[i]>first && arr[i] < arr[ceilIndex])
            ceilIndex = i;
    }
    return ceilIndex;
}
void sortedPermutations(char arr[],int n)
{
    sort(arr,arr+n);    //Sort Given Array
    bool finished = false;
    while(!finished){
        cout << arr << endl;        //Print Current Combination
    }
    int i;
    for(i = n-2; i >= 0; --i)
    {
        if(arr[i]<arr[i+1])         //Rightmost character smaller than next character
            break;
    }
    if(i == -1)
        finished = true;            //Everything is sorted in descending order
    else
    {
        int ceilIndex = findCeil(arr,arr[i],i+1,n);
        swap(arr[i],arr[ceilIndex]);
        sort(arr+i+1,arr+n);
    }
}
int main()
{
    int testcases;
    cin >> testcases;
    for(int i = 0;i < testcases;i++)
    {
        int n;
        cin >> n;
        char arr[n];
        for(int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }
        sortedPermutations(arr,n); 
    }
    return 0; 
}