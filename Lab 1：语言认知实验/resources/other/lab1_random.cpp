#include<iostream>
#include<ctime>
#include<random>
#include<fstream>
#include<string>
using namespace std;

int main ( int argc, char** argv ){
	default_random_engine e;
	uniform_int_distribution<int> u ( -1000, 1000 );
	e.seed ( time ( 0 ) );

	ofstream f ( "testdata.txt", ios::out | ios::trunc );
	if( !f.is_open () ){
		cout << "error!" << endl;
		exit ( 1 );
	}

	string s, t;
	for( int i = 2; i <= 1024; i *= 2 ){
		s = to_string ( i ) + "\n";
		for( int q = 0; q < 2; q++ ){
			for( int j = 0; j < i; j++ ){
				for( int k = 0; k < i; k++ ){
					t.append ( "\t" ).append ( to_string ( u ( e ) ) );
				}
				t.append ( "\n" );
				s.append ( t );
				t.clear ();
			}
			s.append ( "\n" );
		}
		f << s;
		s.clear ();
		cout << i << ": success!" << endl;
	}
	f.close ();
	cout << "All success!" << endl;
	return 0;
}