#include<iostream>
using namespace std;

int main(){

    int vowel = 0;
    int conso = 0;
    string str;

    cout << "Enter text: ";
    getline(cin, str);
    
    for(int i = 0; str[i] != '\0'; i++){
        char ch = str[i];
        //compare with ascii code
        if((ch >= 97 && ch <=122) || (ch >=65 && ch <= 90)){
            if(ch == 'a' || ch == 'e' || ch == 'i' && ch == 'o' && ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' && ch == 'O' && ch == 'U'){
                vowel++;
            }
            else{
                conso++;
            }
        }
    }
    cout << "Number of vowel: " << vowel << endl;
    cout << "Number of consonent: " << conso << endl;
}