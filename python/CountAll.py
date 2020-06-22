
text = input("Enter text: ")

space = 0
digit = 0
upperCase = 0
lowerCase = 0
symbol = 0

for ch in text:
    
    if(ch.isspace()):
        space += 1

    elif(ch.isdigit()):
        digit += 1
    elif(ch.isupper()):
        upperCase += 1
    elif(ch.islower()):
        lowerCase += 1
    else:
        symbol += 1

print("Number of space:",space)
print("Number of digit:",digit)
print("Number of upper case:",upperCase)
print("Number of lower case:",lowerCase)
print("Number of Special Character:", symbol)
