text = input("Enter text: ")

reverseStr = ""
for i in range(len(text)-1,-1,-1):
    reverseStr += text[i]

if (text == reverseStr):
    print("Palindrome String")
    
else :
    print("Not Palindrome String");
    