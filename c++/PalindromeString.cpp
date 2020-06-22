#include <iostream>
using namespace std;

int main()
{
    string str;
    char reverseStr[100];
    char ch;
    int palindrome = 1, l;
    printf("Enter text: ");
    getline(cin, str);

    l = str.length() - 2; //fgets insert extra character at the end i.e '\n'
    for (int i = 0; i < str.length() - 1; i++, l--)
    {
        if (str[i] != str[l])
        {
            palindrome = 0;
            break;
        }
    }

    if (palindrome)
    {

        cout << "Palindrome String\n";
    }
    else
    {
        cout << "not Palindrome String\n";
    }

    return 0;
}