#include<iostream>
#include<windows.h>
#include<fstream>
#include<string>
#include<vector>
#include<regex>

using namespace std;

int main ( int argc, char** argv ){
	LARGE_INTEGER t1, t2, tc;
	QueryPerformanceFrequency ( &tc );
	QueryPerformanceCounter ( &t1 );

	ifstream infile ( "testdata.txt" );
	if( !infile.is_open () ){
		cout << "error!" << endl;
		exit ( 1 );
	}
	ofstream outfile ( "result_C++.txt", ios::out | ios::trunc );
	if( !outfile.is_open () ){
		cout << "error!" << endl;
		exit ( 1 );
	}
	string s, r;
	regex reg ( "\\s+" );
	while( getline ( infile, s ) ){
		if( s.empty () ) continue;
		if( isdigit ( s.at ( 0 ) ) ){
			LARGE_INTEGER t3, t4;
			QueryPerformanceCounter ( &t3 );
			int q = stoi ( s );
			int** leftMatrix = new int* [q];
			for( int i = 0; i < q; i++ ){
				leftMatrix[i] = new int[q];
			}
			int** rightMatrix = new int* [q];
			for( int i = 0; i < q; i++ ){
				rightMatrix[i] = new int[q];
			}
			int* resultVector = new int [q];
			for( int i = 0; i < q; i++ ){
				leftMatrix[i] = new int[q];
				rightMatrix[i] = new int[q];
			}
			for( int i = 0; i < q; i++ ){
				getline ( infile, s );
				int j = 0;
				const sregex_token_iterator end;
				sregex_token_iterator iter ( s.begin (), s.end (), reg, -1 );
				iter++;
				for( ; iter != end; iter++ ){
					string num = iter->str ();
					leftMatrix[i][j++] = stoi ( num );
				}
			}
			getline ( infile, s );
			for( int i = 0; i < q; i++ ){
				getline ( infile, s );
				int j = 0;
				const sregex_token_iterator end;
				sregex_token_iterator iter ( s.begin (), s.end (), reg, -1 );
				iter++;
				for( ; iter != end; iter++ ){
					string num = iter->str ();
					rightMatrix[i][j++] = stoi ( num );
				}
			}
			r.append ( to_string ( q ) ).append ( "\n" );
			cout << r;
			outfile << r;
			r.clear ();
			for( int i = 0; i < q; i++ ){
				memset ( resultVector, 0, q * sizeof ( int ) );
				for( int k = 0; k < q; k++ ){
					int x=leftMatrix[i][k];
					for( int j = 0; j < q; j++ ){
						resultVector[j] += x * rightMatrix[k][j];
					}
				}
				for( int j = 0; j < q; j++ ){
					r.append ( "\t\t" ).append ( to_string ( resultVector[j] ) );
				}
				r.append ( "\n" );
				cout << r;
				outfile << r;
				r.clear ();
			}
			cout << q << ": success!" << endl;
			QueryPerformanceCounter ( &t4 );
			double time = ( double )( t4.QuadPart - t1.QuadPart ) / ( double )tc.QuadPart;
			r.append ( "TIME: " ).append ( to_string ( time ) ).append ( "s.\n\n" );
			cout << r;
			outfile << r;
			r.clear ();
			for( int i = 0; i < q; i++ ){
				delete[] leftMatrix[i];
			}
			for( int i = 0; i < q; i++ ){
				delete[] rightMatrix[i];
			}
			delete[] leftMatrix;
			delete[] rightMatrix;
			delete[] resultVector;
		}
	}

	QueryPerformanceCounter ( &t2 );
	double time = ( double )( t2.QuadPart - t1.QuadPart ) / ( double )tc.QuadPart;
	r.append ( "TOTAL TIME: " ).append ( to_string ( time ) ).append ( "s.\n" );
	cout << r;
	outfile << r;
	infile.close ();
	outfile.close ();
	return 0;
}