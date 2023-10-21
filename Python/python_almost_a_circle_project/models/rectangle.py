"""class rectangle
"""

from models.base import Base

class Rectangle(Base):
    def __init__(self, width, height, x=0, y=0, id=None):
        super().__init__(id)
        self.width = width
        self.height = height
        self.x = x
        self.y = y
    

    def validator(self, name, value, leq):
        """Validator method"""
        if not isinstance(value, int):
           raise TypeError("{} must be an integer".format(name))
        if leq:
           if value <= 0:
               raise ValueError("{} must be > 0".format(name))
        else:
            if value < 0:
                raise ValueError("{} must be >= 0".format(name))
    def area(self):
        """returns the area of a rectangle"""
        return self.__width * self.__height

    def display(self):
        """display the rectangle"""
        for i in range(self.__y):
            for j in range(self.__x):
                print("#", end="")
            print()

    @property
    def width(self):
        """ width getter"""
        return self.__width

    @width.setter
    def width(self, width):
        self.validator("width", width, True)
        self.__width = width

    @property
    def height(self):
        """ width getter"""
        return self.__height

    @height.setter
    def height(self, height):
        self.validator("height", height, True)
        self.__height = height

    @property
    def x(self):
        """ width getter"""
        return self.__x

    @x.setter
    def x(self, x):
        self.validator("x", x, False)
        self.__x = x

    @property
    def y(self):
        """ width getter"""
        return self.__y

    @y.setter
    def y(self, y):
        self.validator("y", y, False)
        self.__y = y