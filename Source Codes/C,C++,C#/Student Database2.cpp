#include<iostream>
#include<bits/stdc++.h>
#include<string.h>
using namespace std;
struct id
{
	int lengthOfName;
	char name[20];
	char yofad[4];
	char branch[3];
	char rno[3];
	char bd[2];
	char bm[2];
	char by[4];
};
int main()
{
	int n,q;
	cin >> n >>q;
	id students[n];
	for(int j = 0;j< n;j++)
	{
        string name;
        cin >> name;
	}
	for(int i = 0;i < q;i++)
	{
		int qtype,ind1,ind2;
		cin >> qtype;
		if(qtype == 1)
		{
			cin >> ind1 >> ind2;
			ind1--;ind2--;
			bool ans = true;
			for(int i = 0;i < 4;i++)
			{
				if(students[ind1].yofad[i] != students[ind2].yofad[i])
				{
					ans = false;
					break;
				}
			}
			if(ans)
			{
				for(int i = 0;i < 3;i++)
				{
					if(students[ind1].branch[i] != students[ind2].branch[i])
					{
						ans = false;
						break;
					}
				}
			}
			if(ans)
				cout << "Yes" << endl;
			else
				cout << "No" << endl;
		}
		else if(qtype == 2)
		{
			cin >> ind1 >> ind2;
			ind1--;ind2--;
			bool isequal = true;
			for(int i = 0;i < 4;i++)
			{
				if(students[ind1].by[i] != students[ind2].by[i])
				{
					if(students[ind1].by[i] > students[ind2].by[i])
						cout << "The first person is older" << endl;
					else
						cout << "The second person is older" << endl;
					isequal = false;
					break;
				}
			}
			if(isequal)
			{
				for(int i = 0;i < 2;i++)
				{
					if(students[ind1].bm[i] != students[ind2].bm[i])
					{
						if(students[ind1].bm[i] > students[ind2].bm[i])
							cout << "The first person is older" << endl;
						else
							cout << "The second person is older" << endl;
						isequal = false;
						break;
					}
				}
				if(isequal)
				{
					for(int i = 0;i < 2;i++)
					{
						if(students[ind1].bd[i] != students[ind2].bd[i])
						{
							if(students[ind1].bd[i] > students[ind2].bd[i])
								cout << "The first person is older" << endl;
							else
								cout << "The second person is older" << endl;
							isequal = false;
							break;
						}
					}
					if(isequal)
					{
						cout <<  "They are the same age" << endl;
					}
				}
			}
		}
		else if(qtype == 3)
		{
			cin >> ind1;
			ind1--;
			char rollno[10];
			bool ismatchout = false;
			for(int i = 0;i < 10;i++)
			{
				cin >> rollno[i];
			}
			for(int i = 0;i < n;i++)  //Check all roll no.
			{
				bool ismatchin = true;//Check
				for(int j = 0;j < 4;j++)
				{
					if(students[i].yofad[j] != rollno[j])
					{
						ismatchin = false;
						break;
					}
				}
				if(ismatchin)
				{
					for(int j = 0; j < 3;j++)
					{
						if(students[i].branch[j] != rollno[4+j])
						{
							ismatchin = false;
							break;
						}
					}
					if(ismatchin)
					{
						for(int j = 0;j < 3;j++)
						{
							if(students[i].rno[j] != rollno[7+j])
							{
								ismatchin = false;
								break;
							}
						}
					}
				}
				ismatchout = ismatchout || ismatchin;
			}
			if(ismatchout)//Do update
			{
				for(int x = 0;x < 4;x++)
				{
					students[ind1].yofad[x] = rollno[x];
				}
				for(int x = 0;x < 3;x++)
				{
					students[ind1].branch[x] = rollno[4+x];
				}
				for(int x = 0;x < 3;x++)
				{
					students[ind1].rno[x] = rollno[7+x];
				}
				cout << "Roll number changed" << endl;
			}
			else
				cout << "Roll number already exists" << endl;
		}
		else if(qtype == 4)
		{
			cin >> ind1;
			ind1--;
			for(int x = 0;x < students[ind1].lengthOfName;x++)
			{
				cout << students[ind1].name[x];
			}
			cout << " ";
			for(int x = 0;x < 4;x++)
			{
				cout << students[ind1].yofad[x];
			}
			for(int x = 0;x < 3;x++)
			{
				cout << students[ind1].branch[x];
			}
			for(int x = 0;x < 3;x++)
			{
				cout << students[ind1].rno[x];
			}
			cout << " ";
			for(int x = 0;x < 2;x++)
			{
				cout << students[ind1].bd[x];
			}
			for(int x = 0;x < 2;x++)
			{
				cout << students[ind1].bm[x];
			}
			for(int x = 0;x < 4;x++)
			{
				cout << students[ind1].by[x];
			}
			cout << endl;
		}
	}
}