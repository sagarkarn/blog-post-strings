#include <iostream>
using namespace std;

int main()
{
    string str;
    int length = 0 ,i; 

    printf("Enter String: ");
    getline(cin,str);

    //without using function
    for (i = 0; str[i] != '\0'; i++)
    { 
        length++;
    }
    cout << "Length of text" << length;

    
}