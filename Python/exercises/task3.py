#!/usr/bin/python3
age = eval(input("Enter the age "))

if (age >= 1) and (age <= 18):
    print("Important")
elif (age == 21) or (age == 50):
    print("Important")
elif not (age < 65):
    print("Important Birthday")
else:
    print("No Important")
