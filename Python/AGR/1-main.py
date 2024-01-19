#!/usr/bin/python3

"""
module main2
"""

def print_arg(**kwargs):
    for key, value in kwargs.items():
        print(f"His {key} is {value}")

print_arg(name="Tony", age="26", passion="Programming")
