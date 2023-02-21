#include<iostream>
#include<conio.h>
using namespace std;
int ans = 0;
bool isUnique(int arr[],int n)
{
    bool isUnique = true;
    for(int x = 0;x < n;x++)
    {
        for(int y = x+1;y < n;y++)
        {
            if(arr[x] == arr[y])
                isUnique = false;
        }
    }
    return isUnique;
}
void kpartition(int arr[],int n,int k)
{
    if(n < k)
        return;
    if(n == k)
    {
        if(isUnique(arr,n))
            ans++;
        return;
    }
    if(k == 1)
    {
        if(isUnique(arr,n))
            ans++;
        return;
    }
    else
    {
        //Form k-par arr and new arr
        //Check for uniqueness first
        //Then proceed for k-par of newarr
        
    }
}
int main()
{
    int testcases;
    cin >> testcases;
    for(int i = 0;i < testcases;i++)
    {
        ans = 0;
        int n,k;
        cin >> n >> k;
        int arr[n];
        for(int j = 0;j < n;j++)
		{
			cin >> arr[j];
		}
        kpartition(arr,n,k);
        cout << ans << endl;
    }
    getch();
}