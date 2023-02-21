#include<iostream>
#include<conio.h>
using namespace std;
bool Proceed(int arr[9][9],int i,int j,int num)
{
    //Checks conditions for value at i,j to be valid.
    //Check variation in i -- j constant
    for(int x = 0;x < 9;x++)
    {
        if(x != i && arr[x][j] == num)
            return false;
    }
    //Check variation in j -- i constant
    for(int x = 0;x < 9;x++)
    {
        if(x != j && arr[i][x] == num)
            return false;
    }
    //Check in corresponding 3x3 submatrix
    int xinitial = i - i % 3;
    int yinitial = j - j % 3;
    for(int x = xinitial;x < xinitial+3;x++)
    {
        for(int y = yinitial;y < yinitial+3;y++)
        {
            if(arr[x][y] == num)
            {
                return false;
            }
        }
    }
    return true;
}
bool FindUnassignedLocation(int arr[9][9], int &row, int &col)
{
    for (row = 0; row < 9; row++)
        for (col = 0; col < 9; col++)
            if (arr[row][col] == 0)
                return true;
    return false;
}
bool SolveSudoku(int arr[9][9])
{
    //Find if any Unassigned positions are present or not.
    //Also return row and col of first unassigned occuernce
    //For numbers 1 to 9 check if arr is safe
    //If safe, assign num to (row,col)
    //Solve new development ,if solvable return true,
    //else assign (row,col) = 0
    int row, col;
    if (!FindUnassignedLocation(arr, row, col))
       return true;
    for (int num = 1; num <= 9; num++)
    {
        if (Proceed(arr, row, col, num))
        {
            arr[row][col] = num;
            if (SolveSudoku(arr))
                return true;
            arr[row][col] = 0;
        }   
    }
    return false;
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
    if(SolveSudoku(arr))
    {
        for(int x = 0;x < 9;x++)
        {
            for(int y = 0;y < 9;y++)
            {
                cout << arr[x][y] << " ";
            }
            cout << endl;
        }
    }
    getch();
}