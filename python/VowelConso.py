ch = input("Enter a Alphabetical Character: ").lower()[0] #change to lower case at index 0
vowel = False
'''
    *  note: java hasn't any method insert character so we use charAt()
    * charAt() return a character at index "n" of string
'''

if(ch == 'a' or ch == 'e' or ch == 'i' or ch == 'o' or ch == 'u'):
    vowel = True
else:
    vowel = False

if(vowel):
    print("Vowel Character")
else:
    print("Consonent Character")
