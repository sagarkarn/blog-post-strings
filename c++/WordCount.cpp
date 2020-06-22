#include <iostream>
using namespace std;

int main()
{
    string str;
    int word = 1;
    cout << "Enter text: ";
    getline(cin,str);
    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] == ' ')
        {
            word++;
        }
    }
    printf("Number of word: %d",word);
}