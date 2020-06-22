#include <iostream>
#include <string.h>
using namespace std;

int main()
{
    string first, second;
    char ch1, ch2;
    int equal = 1;
    printf("Enter first text: ");

    //rebember that fgets also include '\n' character
    getline(cin, first);
    printf("Enter second text: ");
    getline(cin, second);

    // without using equals method
    if (first.length() != second.length())
    {
        equal = 0;
    }
    if (equal)
    {
        for (int i = 0; i < first.length(); i++)
        {
            ch1 = first[i];
            ch2 = second[i];
            if (ch1 != ch2)
            {
                equal = 0;
                break;
            }
        }
    }
    if (equal)
    {
        cout << "equal texts";
    }
    else
    {
        cout << "not equal texts";
    }
}