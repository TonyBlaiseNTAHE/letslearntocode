"""class for testing classes and class's methods
"""

"""Importing unitest package
"""
import unittest 

class Base:
    __nb__object = 0
    def __init__(self, id=None):
        if id is not None:
            self.id = id
        else:
            Base.__nb__object += 1
            self.id = Base.__nb__object

class TestBase(unittest.TestCase):
    """testing Class Base"""
    def setUp(self):
        self.base = Base()
        
    def test_attribute(self):
        result = self.base.id
        self.assertEqual(result, 1)
        self.base = Base(2)
        result = self.base.id
        self.assertEqual(result, 2)
        self.base = Base()
        result = self.base.id
        self.assertEqual(result, 2)
        self.base = Base()
        result = self.base.id
        self.assertEqual(result, 3)
        self.base = Base(20)
        result = self.base.id
        self.assertEqual(result, 20)
        self.base = Base()
        result = self.base.id
        self.assertEqual(result, 4)
        
    def test_parameters(self):
        with self.assertRaises(TypeError):
            self.base = Base(1,2)
        with self.assertRaises(TypeError):
            self.base = Base(1,2,3)
        with self.assertRaises(TypeError):
            self.base = Base(1,2,4)
        with self.assertRaises(TypeError):
            self.base = Base(1,2,5)
        with self.assertRaises(TypeError):
            self.base = Base(1,2,5,6,'+')
        
        
        
        
if __name__ == "__main__":
    unittest.main()