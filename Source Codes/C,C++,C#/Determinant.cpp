#include<iostream>
#include<cmath>
using namespace std;
int deter(int *a,int n)
{
	int arr[n][n];
	for(int i=0; i<n; i++)
        {
        	for(int j=0; j<n; j++)
		{
            		arr[i][j] = a[i*n + j]; 
        	}
    	}
	if(n == 1)
	{
		return arr[0][0];
	}
	else
	{
		int sum = 0;
		for(int i = 0; i < n;i++)
		{
			int passarr[(n-1)*(n-1)];
			int index = 0;
			for(int j = 1; j < n;j++)
			{
				for(int k = 0;k < n; k++)
				{
					if(k != i)
					{
						passarr[index] = arr[j][k];
						index++;
					}
				}
			}
			sum = sum + arr[0][i]*deter(passarr, n-1)*pow(-1,i);
		}
		return sum;
	}
}
int main()
{
	int n;
	cin >> n;
	int arr[n*n];
	for(int i = 0; i < n*n; i++)
	{
		cin >> arr[i];
	}
	cout << deter((int *) arr,n);
}