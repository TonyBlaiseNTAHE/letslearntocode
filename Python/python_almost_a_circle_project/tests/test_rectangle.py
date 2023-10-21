"""test class
"""

from models.base import Base
from models.rectangle import Rectangle
import unittest


class TestBase(unittest.TestCase):
    """testing rectangle
    """
    def setUp(self):
        super().setUp()
        
    def test_attribute(self):
        self.r = Rectangle(1,2)
        result = self.r.id
        self.assertEqual(result, 5)
        self.r = Rectangle(2,10)
        result = self.r.id
        self.assertEqual(result, 6)
        self.r = Rectangle(2,10, 0, 0, 12)
        result = self.r.id
        self.assertEqual(result, 12)
    
    def test_area(self):
        self.r = Rectangle(3,4)
        result = self.r.area()
        self.assertEqual(result, 12)
        self.r = Rectangle(3,10)
        result = self.r.area()
        self.assertEqual(result, 30)
        self.r = Rectangle(3,3)
        result = self.r.area()
        self.assertEqual(result, 9)
        self.r = Rectangle(1,2)
        result = self.r.area()
        self.assertEqual(result, 2)
        
    def test_Parameters(self):
        with self.assertRaises(TypeError):
            self.r = Rectangle(2,10, 0, 0, 12, 2)
        
        