import unittest
from circles import circle_area
from math import pi

class TestCircleArea(unittest.TestCase):
    def test_area(self):
        """Test areas when radius >= 0"""
        self.assertAlmostEqual(circle_area(1), pi)
        self.assertAlmostEqual(circle_area(0), 0)
        self.assertAlmostEqual(circle_area(2.1), pi * 2.1 ** 2)

    def test_value(self):
        """Testing if it a int or float"""
        self.assertRaises(ValueError, circle_area, -2)
    def test_types(self):
        """Test the type of the radius"""
        self.assertRaises(TypeError, circle_area, "raidus")
        self.assertRaises(TypeError, circle_area, 5j)
        self.assertRaises(TypeError, circle_area, True)