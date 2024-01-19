#!/usr/bin/python3

"""
model mult
"""

def mult(*arg):
    z = 1
    for n in arg:
        z *= n
    return z

print(mult(2, 3, 3, 9 , 10))
