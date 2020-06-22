
text = input("Enter text: ")
# convert to lower case
vowel = 0
conso = 0
for ch in text:
    if (ch >= 'a' and ch <= 'z'):
        if (ch == 'a' or ch == 'e' or ch == 'i' or ch == 'o' or ch == 'u'):
            vowel += 1
        else:
            conso += 1;
        
print("Number of vowel:",vowel)
print("Number of consonent:",conso)
