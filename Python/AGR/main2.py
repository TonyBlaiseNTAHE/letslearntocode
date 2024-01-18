#!/usr/bin/python3


"""
module main2 
"""

def print_dict(*args, **kwargs):
    print("{} - {}".format(args, kwargs))

a_dict = {'name':"Tony", 'age': 26, 'passion': "Programming"}
print_dict(a_dict)
print_dict(*a_dict)
print_dict(**a_dict)
