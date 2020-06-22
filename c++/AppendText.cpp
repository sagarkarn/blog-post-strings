#include <iostream>
using namespace std;

int main()
{
    string first, second;
    int i,j;

    cout << "Enter first text: ";
    getline(cin, first);
    cout << "Enter second text: ";
    getline(cin,second);
    first = first + second;

    cout << "Appended text: "<< first;
    return 0;
}
