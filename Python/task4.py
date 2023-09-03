#!/usr/bin/python3
age = eval(input("Enter the age: "))

if age == 5:
    print("Go to Kindergarten")
elif age < 5:
    print("Too young for school")
elif  (age >= 6) or (age <= 17):
    grade = age - 5
    print("Go to {} grade".format(grade))
else:
    print("Go to college")
    