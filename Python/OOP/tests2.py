def greet_me(**kwargs):
    if kwargs is not None:
        for key, value in kwargs.items():
            print("{:s} == {:s}".format(key, value))

greet_me(name="Tony")
