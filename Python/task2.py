#!/usr/bin/python3
calculation = input("Enter the calculation: ")
num1, opr, num2 = calculation.split()
num1 = int(num1)
num2 = int(num2)

if opr == '+':
    result = num1 + num2
    print("{} + {} = {}".format(num1, num2, result))
elif opr == '-':
    result = num1 - num2
    print("{} - {} = {}".format(num1, num2, result))
elif opr == '*':
    result = num1 * num2
    print("{} * {} = {}".format(num1, num2, result))
else:
    print("Use either - or + or * another time")
