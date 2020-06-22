first = input("Enter first text: ")
second = input("Enter second text: ")

equal = True
if(len(first) != len(second)):
    equal = False

if(equal):
    for i in range(0,len(first)):
        if(first[i] != second[i]):
            equal = False
            break

if(equal):
    print("equal texts")
else:
    print("not equal texts")
