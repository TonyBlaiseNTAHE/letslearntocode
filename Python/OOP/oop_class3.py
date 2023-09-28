#!/usr/bin/python3
import datetime
class User:
    """user class for our users"""
    def __init__(self, name, age, birthday):
        self.name = name
        self.age = age
        self.birthday = birthday
    def say_hi(self):
        """ prints a greating message""" 
        print("Hello, My name is ", self.name)
    def cal_age(self):
        """Returns the age of the user in year"""
        today = datetime.date(2023, 9, 28)
        yyyy = int(str(self.birthday)[0:4])
        mm = int(str(self.birthday)[4:6])
        dd = int(str(self.birthday)[6:7])
        dob = datetime.date(yyyy, mm, dd)
        age_in_days = (today - dob).days
        age_in_years = age_in_days / 365
        return age_in_years

##user = User("Tony Blaise", 26, 1997091)
##print(user.cal_age())
help(User)


