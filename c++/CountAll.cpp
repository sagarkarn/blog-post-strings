#include<iostream>
using namespace std;

int main(){
    int space=0,digit=0,upperCase=0,lowerCase=0,symbol=0,i;
    string text;
    char ch;
    printf("Enter text: ");

    //you can use gets() or fgets();
    getline(cin,text);
    cout << text;
    for(i = 0; text[i] != '\0'; i++){
         ch = text[i];
         
         if(ch == ' '){
            space++;
        }else if(ch >= 48 && ch <= 57){
            digit++;
        }else if(ch >= 65 && ch <= 90){
            upperCase++;
        }else if(ch >= 97 && ch <= 122){
            lowerCase++;
        }else{
            symbol++;
        }
    }

    cout << "Number of space: " << space << endl;
    cout << "Number of digit: " << digit << endl;
    cout << "Number of upper case: " << upperCase << endl;
    cout << "Number of lower case: " << lowerCase << endl;
    cout << "Number of Special Character: " << symbol << endl;

    return 0;
}