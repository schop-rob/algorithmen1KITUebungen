#author Robin Schöppner
#version 2
import argparse
import random
parser = argparse.ArgumentParser(description="Manipulieren von Anzahl der Aufgaben")
parser.add_argument("--tasks", default = 6, help = "Anzahl Aufgaben, die generiert werden sollen")
args = parser.parse_args()
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

print("Willst du insert/remove Aufgaben?")
result = input("Y für ja, N für nein\n")
if (result != "Y"):
    print("Schade")
    exit()

for i in range(int(args.tasks)):
    value = bool(random.getrandbits(1))
    if (value):
        newNum = random.randrange(maxNumber)
        while newNum in numbers:
            newNum = random.randrange(maxNumber)
        numbers.append(newNum)
        print(f"insert({newNum})")
    else:
        numbers.pop(0)
        print("deleteMin()")