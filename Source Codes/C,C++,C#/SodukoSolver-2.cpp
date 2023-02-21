#include<iostream>
#include<conio.h>
using namespace std;
bool Proceed(int arr[9][9],int i,int j)
{
    //Checks conditions for value at i,j to be valid.
    //Check variation in i -- j constant
    for(int x = 0;x < 9;x++)
    {
        if(x != i && arr[x][j] == arr[i][j])
            return false;
    }
    //Check variation in j -- i constant
    for(int x = 0;x < 9;x++)
    {
        if(x != j && arr[i][x] == arr[i][j])
            return false;
    }
    //Check in corresponding 3x3 submatrix
    int xinitial = i - i % 3;
    int yinitial = j - j % 3;
    for(int x = xinitial;x < xinitial+3;x++)
    {
        for(int y = yinitial;y < yinitial+3;y++)
        {
            if(x != i && y != j && arr[x][y] == arr[i][j])
            {
                return false;
            }
        }
    }
    return true;
}
void SolveSudoku(int arr[9][9],int i,int j)
{
    if(i == 9)
    {
        for(int i = 0;i < 9;i++)
        {
            for(int j = 0;j < 9;j++)
            {
                cout << arr[i][j] << " ";
            }
            cout << endl;
        }
        return;
    }
    if(arr[i][j] == 0)
    {
        for(int m = 1;m < 10;m++)
        {
            arr[i][j] = m;
            bool proceed = Proceed(arr,i,j);
            if(!proceed)
                continue;
            else
            {
                if(j == 8)
                {
                    SolveSudoku(arr,i+1,0);
                    break;
                }
                else
                {
                    SolveSudoku(arr,i,j+1);
                    break;
                }
            }
        }
        arr[i][j] = 0;
        return;
    }
    else
    {
        if(j == 8)
        {
            SolveSudoku(arr,i+1,0);
        }
        else
        {
            SolveSudoku(arr,i,j+1);
        }
    }
}
int main()
{
    int arr[9][9];
    for(int x = 0;x < 9;x++)
    {
        for(int y = 0;y < 9;y++)
        {
            cin >> arr[x][y];
        }
    }
    SolveSudoku(arr,0,0);
    getch();
}