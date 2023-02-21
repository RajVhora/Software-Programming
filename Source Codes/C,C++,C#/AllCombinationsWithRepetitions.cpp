#include<iostream>
#include<algorithm>
#include<conio.h>
using namespace std;
void printPattern(char arr[],int size,char previous_char_arr[],int chars_to_consider)
{
    if(size == 1)
	{
		for(int i = 0;i < chars_to_consider;i++)
        {
            cout << previous_char_arr[i];
        }
        cout << arr[0] << endl;
		return;
	}
	else
	{
		for(int i = 0;i < size;i++)
		{
			//cout << arr[i];
			//Array without arr[i];
            char previous_char[chars_to_consider+1];
            for(int k = 0;k < chars_to_consider;k++)
            {
                previous_char[k] = previous_char_arr[k];
            }
            previous_char[chars_to_consider] = arr[i];//0 or i
			char newarr[size - 1];
			int index = 0;
			for(int j = 0;j < size;j++)
			{
				if(j != i)
				{
					newarr[index] = arr[j];
					index++;
				}
			}
			printPattern(newarr,size-1,previous_char,chars_to_consider+1);
		}
	}
}
int main()
{
    int test_cases;
	cin >> test_cases;
	for(int j = 0;j < test_cases;j++)
	{
		int n;
		cin >> n;
		char arr[n];
		for(int i = 0;i < n;i++)
		{
			cin >> arr[i];
		}
		sort(arr,arr+n);
        char emptyarr[n] = arr;
		printPattern(arr,n,empty_arr,0);
		cout << endl;
	}
}
