#include <iostream>
using namespace std;

int main()
{   
    string str;
    string reverseStr = "";
    int i,l;
    cout << "Enter text: ";
    getline(cin,str);
    
    for (i = str.length(); i >= 0; i--)
    {
        reverseStr += str[i];
    }
    cout << "After Reversing: " << reverseStr;
}