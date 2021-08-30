import argparse
import random
parser = argparse.ArgumentParser(description="Manipulieren von Anzahl der Aufgaben")
parser.add_argument("--tasks", default = 15, help = "Anzahl Aufgaben, die generiert werden sollen, zum Beispiel:\n--tasks=4")
args = parser.parse_args()

numbers = []

for i in range(int(args.tasks)):
    value = bool(random.getrandbits(1))
    if (value | len(numbers) < 2):
        newNum = random.randrange(70)
        while newNum in numbers:
            newNum = random.randrange(70)
        numbers.append(newNum)
        print(f"insert({newNum})")
    else :
        numba = numbers.pop(random.randrange(len(numbers)))
        print(f"delete({numba})")