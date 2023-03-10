// Matrix Inversion.cpp : Defines the entry point for the console application.
//
#include<iostream>
#include<conio.h>
#include<math.h>
using namespace std;
float coFactor(float matrix[3][3], int i, int j) {
	int pointer = 0;
	float a, b, c, d;
	for (int r = 0; r < 3; r++)
	{
		for (int s = 0; s < 3; s++) {
			if (r != i && s != j) {
				switch (pointer)
				{
				case 0:
					a = matrix[r][s];
					break;
				case 1:
					b = matrix[r][s];
					break;
				case 2:
					c = matrix[r][s];
					break;
				case 3:
					d = matrix[r][s];
				default:
					break;
				}
				pointer++;
			}
		}
	}
	return (a*d) - (b*c);
}
int main()
{
	float matrix[3][3], invertedmat[3][3];
	cout << "Matrix Inversion Program:" << endl;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++)
		{
			cout << "Enter Element at (" << i << "," << j << ") :";
			cin >> matrix[i][j];
		}
	}
	float det = (matrix[0][0] * coFactor(matrix, 0, 0)) - (matrix[0][1] * coFactor(matrix, 0, 1)) + (matrix[0][2] * coFactor(matrix, 0, 2));
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++) {
			invertedmat[j][i] = coFactor(matrix, i, j)* pow(-1, i + j) / det;
		}
	}
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++) {
			cout << invertedmat[i][j]<<"\t";
		}
		cout << endl;
	}
	_getch();
	return 0;
}

