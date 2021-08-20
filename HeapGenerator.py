import random
val = int(input("Wie lang soll der Heap sein?\n"))
maxNumber = int(input("Wie groß darf eine Zahl maximal sein?\n"))
if (maxNumber < val):
    print("Fuck you too")
    exit()
    
numbers = []
for i in range(val):
    newNum = random.randrange(maxNumber)
    while newNum in numbers:
        newNum = random.randrange(maxNumber)
    numbers.append(newNum)
print(numbers)