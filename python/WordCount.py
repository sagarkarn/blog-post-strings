
text = input("Enter text: ")


word = 1
for ch in text:
    if(ch.isspace()):
        word += 1
    
print("Number of word:",word)