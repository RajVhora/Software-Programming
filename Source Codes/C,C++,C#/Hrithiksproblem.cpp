#include <iostream>
using namespace std;
class Angle{
public:
	int deg;
	int min;
	int sec;
	Angle(){
		deg=0;
		min=0;
		sec=0;
	}
	Angle(int deg1,int min1,int sec1){
		deg=deg1;
		min=min1;
		sec=sec1;
	}
	Angle(int sec1){
		sec=sec1%60;
		sec1=sec1/60;
		min=sec1%60;
		sec1=sec1/60;
		deg=sec1;
	}
	Angle(const Angle &obj){
		deg=obj.deg;
		sec=obj.sec;
		min=obj.min;
	}
	void print() const{
		cout << deg << " " << min << " " << sec << endl;
	}
	int toSeconds() const{
		int s;
		s=sec+(min*60)+(deg*3600);
		return s;
	}
	Angle operator +(const Angle &obj){
		int p;
		p=this->toSeconds()+obj.toSeconds();
		Angle b(p);
		return b;
	}
	Angle operator -(const Angle &obj){
		int p;
		p=this->toSeconds()-obj.toSeconds();
		Angle a(p);
		return a;
	}
	Angle operator *(int n){
		int p;
		p=this->toSeconds()*n;
		Angle c(p);
		return c;
	}
	void operator =(const Angle &obj){
		sec=obj.sec;
		min=obj.min;
		deg=obj.min;
	}
	Angle getComplement(){
		int p;
		p=(90*3600)-this->toSeconds();
		Angle b(p);
		return b;
	}

};

int main(){
	int n;
	cin >> n;
	int deg1,min1,sec1,m;
	char op;
	cin >> deg1 >> min1 >> sec1;
	Angle a1;
	a1.deg = deg1;
	a1.min = min1;
	a1.sec = sec1;
	for(int i = 0;i < n;i++){
		cin >> op;
		if(op == '+'){
			cin >> deg1 >> min1 >> sec1;
			Angle a2(deg1,min1,sec1);
			a1 = a1 + a2;
		}
		else if(op == '-'){
			cin >> deg1 >> min1 >> sec1;
			Angle a2(deg1,min1,sec1);
			a1 = a1 - a2;
		}
		else if(op == '='){
			cin >> deg1 >> min1 >> sec1;
			Angle a2(deg1,min1,sec1);
			a1 = a2;
		}
		else if(op == '*'){
			cin >> m;
			a1 = a1*m;
		}
		else if(op == 'p'){
			a1.print();
		}
		else if(op == 'c'){
			a1 = a1.getComplement();
		}
	}
	a1.print();
	return 0;
}

