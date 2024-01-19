#!/usr/bin/python3


from datetime import datetime

n = datetime.now()
date_now = datetime.fromisoformat(str(n))
print(date_now)
