#include<iostream>
#include<conio.h>
using namespace std;
int ans = 0;
void combinations(int arr[], int len, int startPosition, int result[],int k);
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
    for(int i = 1;i <= n;i++)
    {
        int result[i];
        combinations(arr,n - i,0,result,k);
    }
}
void combinations(int arr[], int len, int startPosition, int result[],int k){
    if (len == 0)
    {
        //Do Work
        if(isUnique(result,sizeof(result))
        {   
            kpartition(result,sizeof(result),k-1);
        }
        return;
    }       
    for (int i = startPosition; i <= sizeof(result)-len; i++)
    {
        result[sizeof(result) - len] = arr[i];
        combinations(arr, len-1, i+1, result,k);
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
        cout << ans/2 << endl;
    }
    getch();
}