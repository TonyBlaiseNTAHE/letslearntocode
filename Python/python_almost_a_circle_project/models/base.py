"""class Base
"""


class Base:
    """__init__(): class constructor
       args: self - the class it self
             id - the id of the class
    """
    __nb__object = 0
    def __init__(self, id=None):
        if id is not None:
            self.id = id
        else:
            Base.__nb__object += 1
            self.id = Base.__nb__object
        