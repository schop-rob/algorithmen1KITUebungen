import argparse
import random
parser = argparse.ArgumentParser(description="Manipulieren von Anzahl der Aufgaben")
parser.add_argument("--tasks", default = 15, help = "Anzahl Aufgaben, die generiert werden sollen, zum Beispiel:\n--tasks=4")
args = parser.parse_args()

numbers = []
adder = 0
print("Starte mit leerem (a,b)-Baum")
for i in range(int(args.tasks)):
    value = random.randrange(16)
    if (value + adder < 11 or len(numbers) < 2):
        newNum = random.randrange(70)
        while newNum in numbers:
            newNum = random.randrange(70)
        numbers.append(newNum)
        print(f"insert({newNum})")
        adder = 0
    else :
        numba = numbers.pop(random.randrange(len(numbers)))
        print(f"delete({numba})")
        adder = 3