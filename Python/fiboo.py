#!/usr/bin/python3
if __name__ == "__main__":
    from fibo import fib, add, fib1
    a = add(2, 4)
    n = 100
    b = fib1(n)
    print("a = {:d}".format(a))
    print("The fibonacci series of {:d} is {}".format(n, b))
    fib(n)
print()
