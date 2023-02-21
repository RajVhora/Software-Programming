#include<iostream>
#include<conio.h>
void DivideBY(float arr[3][3], float DivisionFactor, int row);
void RowSubtraction(float arr[3][3], int tarRow, int RefRow, float multiple);
using namespace std;
void main()
{
	int n = 3;
	float multiple;
	float matrix[3][3], UnitMat[3][3];
	cout << "Matrix Inversion Program:"<<endl<<endl;
	for (int i = 0; i<3; i++) {
		for (int j = 0; j<3; j++) {
			cout << "Enter the element a(" << i << "," << j << ") :";
			cin >> matrix[i][j];
		}
	}
	for (int i = 0; i<3; i++) {
		for (int j = 0; j<3; j++) {
			if (i == j) { UnitMat[i][j] = 1; }
			else { UnitMat[i][j] = 0; }
		}
	}
	//make a00 = 1;
	multiple = matrix[0][0];
	DivideBY(matrix, multiple, 0);
	DivideBY(UnitMat, multiple, 0);
	//make a10 = 0;
	multiple = matrix[1][0];
	RowSubtraction(matrix, 1, 0, multiple);
	RowSubtraction(UnitMat, 1, 0, multiple);
	//make a20 = 0;
	multiple = matrix[2][0];
	RowSubtraction(matrix, 2, 0, multiple);
	RowSubtraction(UnitMat, 2, 0, multiple);
	//make a11 = 1;
	multiple = matrix[1][1];
	DivideBY(matrix, multiple, 1);
	DivideBY(UnitMat, multiple, 1);
	//make a21 = 0;
	multiple = matrix[2][1];
	RowSubtraction(matrix, 2, 1, multiple);
	RowSubtraction(UnitMat, 2, 1, multiple);
	//make a22 = 1;
	multiple = matrix[2][2];
	DivideBY(matrix, multiple, 2);
	DivideBY(UnitMat, multiple, 2);
	//make a12 = 0;
	multiple = matrix[1][2];
	RowSubtraction(matrix, 1, 2, multiple);
	RowSubtraction(UnitMat, 1, 2, multiple);
	//make a02 = 0;
	multiple = matrix[0][2];
	RowSubtraction(matrix, 0, 2, multiple);
	RowSubtraction(UnitMat, 0, 2, multiple);
	//make a01 = 0;
	multiple = matrix[0][1];
	RowSubtraction(matrix, 0, 1, multiple);
	RowSubtraction(UnitMat, 0, 1, multiple);
	//print matrix.
	cout << endl << endl << "The Inverted Matrix is:" << endl;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			cout << UnitMat[i][j] <<"\t";
		}
		cout << endl;
	}
	_getch();
}
void DivideBY(float arr[3][3], float DivisionFactor, int row) {
	for (int i = 0; i<3; i++) {
		arr[row][i] = arr[row][i] / DivisionFactor;
	}
}
void RowSubtraction(float arr[3][3], int tarRow, int RefRow, float multiple) {
	for (int i = 0; i<3; i++) {
		arr[tarRow][i] = arr[tarRow][i] - (multiple*arr[RefRow][i]);
	}
}