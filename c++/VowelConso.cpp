#include <iostream>
using namespace std;

int main()
{
    char ch;
    int isVowel = 0;
    cout << "Enter a Alphabetical Character ";
    cin >> ch;
    

    if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')||
        (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
    { 
        isVowel = 1;
    }

    if (isVowel)
    {
        cout << " is Vowel Character" << ch;
    }
    else
    {
        cout << "is Consonent Character" << ch;
    }
}