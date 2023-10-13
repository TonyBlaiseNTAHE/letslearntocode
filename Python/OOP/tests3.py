def test_args_kwargs(arg1, arg2, arg3):
    print("arg1: {}".format(arg1))
    print("arg2: {}".format(arg2))
    print("arg3: {}".format(arg3))

kwargs = {"arg3": 10, "arg2": 8, "arg1": "tony"}
test_args_kwargs(**kwargs)
